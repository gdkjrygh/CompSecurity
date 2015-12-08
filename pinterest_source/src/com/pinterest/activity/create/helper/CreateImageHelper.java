// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.webkit.URLUtil;
import android.widget.EditText;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.create.adapter.CreateBoardPinAdapter;
import com.pinterest.activity.create.dialog.CreateFromWebDialog;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.IconTextListAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.PermissionUtil;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.kit.utils.ImageUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateImageHelper
{

    private static final int CAMERA_USAGE_PERMISSION_EXPLANATION_IDS[] = {
        0x7f0700ad, 0x7f070571
    };
    public static final int IMAGE_CAPTURE = 800;
    public static final int IMAGE_CROP = 802;
    public static final int IMAGE_SELECT = 801;
    public static File cameraFile;

    public CreateImageHelper()
    {
    }

    private static com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem addItemsToList(int i)
    {
        if (Experiments.G())
        {
            switch (i)
            {
            case 0: // '\0'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(null, Resources.string(0x7f07007e), 1);

            case 1: // '\001'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020155), Resources.string(0x7f07019e), 0);

            case 2: // '\002'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(null, Resources.string(0x7f070412), 1);

            case 3: // '\003'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020158), Resources.string(0x7f0703ed), 0);

            case 4: // '\004'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020159), Resources.string(0x7f0702c7), 0);

            case 5: // '\005'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f02015a), Resources.string(0x7f07041b), 0);
            }
        } else
        {
            switch (i)
            {
            case 0: // '\0'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(null, Resources.string(0x7f07007e), 1);

            case 1: // '\001'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020155), Resources.string(0x7f07019e), 0);

            case 2: // '\002'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(null, Resources.string(0x7f070412), 1);

            case 3: // '\003'
                if (Device.hasCamera())
                {
                    return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020157), Resources.string(0x7f070580), 0);
                } else
                {
                    return null;
                }

            case 4: // '\004'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020158), Resources.string(0x7f0700e2), 0);

            case 5: // '\005'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020159), Resources.string(0x7f0702c7), 0);

            case 6: // '\006'
                return new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f02015a), Resources.string(0x7f07041b), 0);
            }
        }
        while (true) 
        {
            return null;
        }
    }

    private static File getCameraDir()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), String.format("100PINT/%s", new Object[] {
                Application.context().getResources().getString(0x7f070426)
            }));
            if (!file.exists())
            {
                file.mkdirs();
            }
            return file;
        } else
        {
            return null;
        }
    }

    public static String getValidWebUrl(EditText edittext)
    {
        edittext = URLUtil.guessUrl(edittext.getText().toString().trim());
        if (URLUtil.isValidUrl(edittext))
        {
            return edittext;
        } else
        {
            return null;
        }
    }

    private static void gotoPlacePicker()
    {
        Pinalytics.a(ElementType.ADD_PLACE_BUTTON, ComponentType.MODAL_DIALOG);
        Navigation navigation = new Navigation(Location.PLACE_PICKER);
        navigation.putExtra("com.pinterest.EXTRA_MODE", com.pinterest.activity.place.fragment.PlacePickerFragment.Mode.CREATE);
        Events.post(navigation);
    }

    public static Uri handleResult(Activity activity, int i, int j, Intent intent)
    {
        if (i != 802) goto _L2; else goto _L1
_L1:
        Object obj = intent.getData();
        if (obj == null) goto _L4; else goto _L3
_L3:
        intent = ImageUtils.getMediaPath(activity, ((Uri) (obj)));
        if (intent == null) goto _L6; else goto _L5
_L5:
        intent = Uri.parse((new StringBuilder("file://")).append(intent).toString());
        obj = ImageUtils.imageFromUri(activity, intent, 0, 0, 612, 612, false, null);
_L10:
        ImageUtils.storeScratchImage(activity, ((Bitmap) (obj)), "pin", true);
        return intent;
_L6:
        Bitmap bitmap;
        try
        {
            intent = ((Uri) (obj)).getPath();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity) { }
          goto _L7
_L4:
        intent = intent.getExtras();
        if (intent == null) goto _L9; else goto _L8
_L8:
        bitmap = (Bitmap)intent.getParcelable("data");
        intent = ((Intent) (obj));
        obj = bitmap;
          goto _L10
_L2:
        if (j != -1) goto _L7; else goto _L11
_L7:
        return null;
_L9:
        intent = ((Intent) (obj));
        obj = null;
          goto _L10
_L11:
        if (i == 801)
        {
            obj = intent.getData();
            intent = ((Intent) (obj));
            if (obj == null)
            {
                intent = ((Intent) (obj));
                if (cameraFile != null)
                {
                    intent = Uri.fromFile(cameraFile);
                }
            }
            if (intent == null)
            {
                return null;
            }
            obj = intent;
            if (ImageUtils.getMediaPath(activity, intent) == null)
            {
                intent.getPath();
                obj = intent;
            }
        } else
        if (i == 800)
        {
            if (cameraFile == null)
            {
                return null;
            }
            obj = Uri.fromFile(cameraFile);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            MediaScannerConnection.scanFile(Application.context(), new String[] {
                ((Uri) (obj)).getPath()
            }, null, null);
            return ((Uri) (obj));
        }
        return ((Uri) (obj));
        if (true) goto _L5; else goto _L12
_L12:
    }

    public static void showAppListDialog(Context context, final PackageManager pm, List list, final com.pinterest.activity.task.dialog.BaseDialog.OnDialogClickListener dialogClick)
    {
        Collections.sort(list, new _cls7());
        ArrayList arraylist = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++)
        {
            arraylist.add(new com.pinterest.adapter.IconTextListAdapter.IconText(pm.getApplicationIcon(((ResolveInfo)list.get(i)).activityInfo.applicationInfo), (String)pm.getApplicationLabel(((ResolveInfo)list.get(i)).activityInfo.applicationInfo), null));
        }

        pm = new BaseDialog();
        list = new IconTextListAdapter();
        list.setDataSource(arraylist);
        pm.setTitle(context.getString(0x7f07005b));
        pm.setListViewOptions(list, new _cls8());
        Events.post(new DialogEvent(pm));
    }

    public static void showBoardPinSourceDialog(final Context context)
    {
        ArrayList arraylist = new ArrayList();
        byte byte0;
        int i;
        if (Experiments.G())
        {
            byte0 = 5;
        } else
        {
            byte0 = 6;
        }
        for (i = 0; i <= byte0; i++)
        {
            com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem boardpinitem = addItemsToList(i);
            if (boardpinitem != null)
            {
                arraylist.add(boardpinitem);
            }
        }

        final BaseDialog dialog = new BaseDialog();
        dialog.setListViewOptions(new CreateBoardPinAdapter(arraylist), new _cls1());
        Events.post(new DialogEvent(dialog));
    }

    public static void showCamera(Activity activity, String s)
    {
        Object obj;
        obj = new File(getCameraDir(), String.format("IMG-%d.jpg", new Object[] {
            Long.valueOf(System.currentTimeMillis())
        }));
        cameraFile = ((File) (obj));
        obj = Uri.fromFile(((File) (obj)));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (s.length() != 0)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = new Intent("android.media.action.IMAGE_CAPTURE");
        s.putExtra("output", ((android.os.Parcelable) (obj)));
        activity.startActivityForResult(s, 800);
        return;
        try
        {
            Intent intent = new Intent();
            intent.setPackage(s);
            intent.setAction("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", ((android.os.Parcelable) (obj)));
            activity.startActivityForResult(intent, 800);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            CrashReporting.a(activity);
        }
        return;
    }

    public static void showCustomCameraDialog(final Context context, final Intent intent)
    {
        final List apps = new File(getCameraDir(), String.format("IMG-%d.jpg", new Object[] {
            Long.valueOf(System.currentTimeMillis())
        }));
        cameraFile = apps;
        Object obj = Uri.fromFile(apps);
        apps = new Intent("android.media.action.IMAGE_CAPTURE");
        apps.setAction("android.media.action.IMAGE_CAPTURE");
        apps.putExtra("output", ((android.os.Parcelable) (obj)));
        obj = Application.context().getPackageManager();
        apps = ((PackageManager) (obj)).queryIntentActivities(apps, 0x10000);
        intent.putExtra("com.pinterest.EXTRA_SOURCE", "com.pinterest.EXTRA_SOURCE_CAMERA");
        if (apps.size() > 1)
        {
            showAppListDialog(context, ((PackageManager) (obj)), apps, new _cls4());
            return;
        }
        if (apps.size() == 0)
        {
            Application.showToast(0x7f070399);
            return;
        } else
        {
            intent.putExtra("com.pinterest.EXTRA_SOURCE_PACKAGE", ((ResolveInfo)apps.get(0)).activityInfo.packageName);
            context.startActivity(intent);
            return;
        }
    }

    private static void showCustomGalleryDialog(final Context context, PackageManager packagemanager, final List apps, final Intent intent)
    {
        if (apps.size() > 1)
        {
            showAppListDialog(context, packagemanager, apps, new _cls6());
            return;
        } else
        {
            intent.putExtra("com.pinterest.EXTRA_SOURCE_PACKAGE", ((ResolveInfo)apps.get(0)).activityInfo.packageName);
            context.startActivity(intent);
            return;
        }
    }

    public static void showGallery(Activity activity, String s)
    {
        if (s == null || s.length() == 0)
        {
            activity.startActivityForResult(new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 801);
            return;
        } else
        {
            Intent intent = new Intent();
            intent.setPackage(s);
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            activity.startActivityForResult(intent, 801);
            return;
        }
    }

    public static void showImageSourceDialog(Context context)
    {
        if (!(context instanceof BaseActivity))
        {
            throw new IllegalArgumentException("the context has to be a BaseActivity in order to request permission through it in Android M");
        } else
        {
            showBoardPinSourceDialog(context);
            return;
        }
    }

    public static void showImageSourceDialog(final Context context, Bundle bundle)
    {
        Object obj = new ArrayList();
        ((ArrayList) (obj)).add(new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(null, Resources.string(0x7f070412), 1));
        if (Device.hasCamera())
        {
            ((ArrayList) (obj)).add(new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020157), Resources.string(0x7f070580), 0));
        }
        ((ArrayList) (obj)).add(new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020158), Resources.string(0x7f0700e2), 0));
        ((ArrayList) (obj)).add(new com.pinterest.activity.create.adapter.CreateBoardPinAdapter.BoardPinItem(DrawableUtils.tintIcon(0x7f020158), Resources.string(0x7f0703ed), 0));
        final BaseDialog dialog = new BaseDialog();
        obj = new CreateBoardPinAdapter(((ArrayList) (obj)));
        final Intent intent = ActivityHelper.getCreatePinIntent(context);
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        dialog.setListViewOptions(((android.widget.ListAdapter) (obj)), new _cls3());
        Events.post(new DialogEvent(dialog));
    }

    private static void showPinFromWebDialog(Context context)
    {
        Events.post(new DialogEvent(new CreateFromWebDialog()));
    }

    public static void tryCustomGalleryDialog(final BaseActivity activity, final Intent intent)
    {
        final List apps = new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        final PackageManager pm = Application.context().getPackageManager();
        apps = pm.queryIntentActivities(apps, 0x10000);
        intent.putExtra("com.pinterest.EXTRA_SOURCE", "com.pinterest.EXTRA_SOURCE_GALLERY");
        if (apps.size() > 0)
        {
            PermissionUtil.checkPermissionAsync(activity, "android.permission.READ_EXTERNAL_STORAGE", 0x7f070571, new _cls5());
            return;
        } else
        {
            Application.showToast(0x7f07039a);
            return;
        }
    }

    private static void tryUseCameraByJob(final BaseActivity activity, final Runnable job)
    {
        PermissionUtil.checkPermissionAsync(activity, PermissionUtil.getCameraUsagePermissionGroup(), CAMERA_USAGE_PERMISSION_EXPLANATION_IDS, new _cls2());
    }






    private class _cls7
        implements Comparator
    {

        final PackageManager val$pm;

        public final int compare(ResolveInfo resolveinfo, ResolveInfo resolveinfo1)
        {
            return ((String)pm.getApplicationLabel(resolveinfo.activityInfo.applicationInfo)).compareTo((String)pm.getApplicationLabel(resolveinfo1.activityInfo.applicationInfo));
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((ResolveInfo)obj, (ResolveInfo)obj1);
        }

        _cls7()
        {
            pm = packagemanager;
            super();
        }
    }


    private class _cls8
        implements android.widget.AdapterView.OnItemClickListener
    {

        final BaseDialog val$dialog;
        final com.pinterest.activity.task.dialog.BaseDialog.OnDialogClickListener val$dialogClick;

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            dialogClick.onClick(dialog, i);
        }

        _cls8()
        {
            dialogClick = ondialogclicklistener;
            dialog = basedialog;
            super();
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final Context val$context;
        final BaseDialog val$dialog;
        final Intent val$intent;

        public final void onItemClick(AdapterView adapterview, final View view, int i, long l)
        {
            if (!Experiments.G()) goto _L2; else goto _L1
_L1:
            i;
            JVM INSTR tableswitch 0 5: default 44
        //                       0 44
        //                       1 52
        //                       2 44
        //                       3 74
        //                       4 105
        //                       5 111;
               goto _L3 _L3 _L4 _L3 _L5 _L6 _L7
_L3:
            dialog.dismiss();
            return;
_L4:
            Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
            dialog.dismiss();
            return;
_L5:
            Pinalytics.a(ElementType.CAMERA_BUTTON, ComponentType.MODAL_DIALOG);
            class _cls1
                implements Runnable
            {

                final _cls1 this$0;
                final View val$view;

                public void run()
                {
                    Intent intent1 = new Intent(view.getContext(), com/pinterest/activity/create/PhotoGalleryActivity);
                    view.getContext().startActivity(intent1);
                }

                _cls1()
                {
                    this$0 = _cls1.this;
                    view = view1;
                    super();
                }
            }

            CreateImageHelper.tryUseCameraByJob((BaseActivity)context, new _cls1());
            continue; /* Loop/switch isn't completed */
_L6:
            CreateImageHelper.gotoPlacePicker();
            continue; /* Loop/switch isn't completed */
_L7:
            Pinalytics.a(ElementType.FIND_IMAGES_BUTTON, ComponentType.MODAL_DIALOG);
            CreateImageHelper.showPinFromWebDialog(view.getContext());
            if (true) goto _L3; else goto _L2
_L2:
            int j = i;
            if (!Device.hasCamera())
            {
                j = i + 1;
            }
            switch (j)
            {
            case 1: // '\001'
                Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
                dialog.dismiss();
                return;

            case 3: // '\003'
                Pinalytics.a(ElementType.CAMERA_BUTTON, ComponentType.MODAL_DIALOG);
                class _cls2
                    implements Runnable
                {

                    final _cls1 this$0;

                    public void run()
                    {
                        intent.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070732));
                        CreateImageHelper.showCustomCameraDialog(context, intent);
                    }

                _cls2()
                {
                    this$0 = _cls1.this;
                    super();
                }
                }

                CreateImageHelper.tryUseCameraByJob((BaseActivity)context, new _cls2());
                break;

            case 4: // '\004'
                Pinalytics.a(ElementType.GALLERY_BUTTON, ComponentType.MODAL_DIALOG);
                intent.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070734));
                CreateImageHelper.tryCustomGalleryDialog((BaseActivity)context, intent);
                break;

            case 5: // '\005'
                CreateImageHelper.gotoPlacePicker();
                break;

            case 6: // '\006'
                Pinalytics.a(ElementType.FIND_IMAGES_BUTTON, ComponentType.MODAL_DIALOG);
                CreateImageHelper.showPinFromWebDialog((BaseActivity)context);
                break;
            }
            if (true) goto _L3; else goto _L8
_L8:
        }

        _cls1()
        {
            dialog = basedialog;
            context = context1;
            intent = intent1;
            super();
        }
    }


    private class _cls4
        implements com.pinterest.activity.task.dialog.BaseDialog.OnDialogClickListener
    {

        final List val$apps;
        final Context val$context;
        final Intent val$intent;

        public final void onClick(BaseDialog basedialog, int i)
        {
            intent.putExtra("com.pinterest.EXTRA_SOURCE_PACKAGE", ((ResolveInfo)apps.get(i)).activityInfo.packageName);
            context.startActivity(intent);
            basedialog.dismiss();
        }

        _cls4()
        {
            intent = intent1;
            apps = list;
            context = context1;
            super();
        }
    }


    private class _cls6
        implements com.pinterest.activity.task.dialog.BaseDialog.OnDialogClickListener
    {

        final List val$apps;
        final Context val$context;
        final Intent val$intent;

        public final void onClick(BaseDialog basedialog, int i)
        {
            intent.putExtra("com.pinterest.EXTRA_SOURCE_PACKAGE", ((ResolveInfo)apps.get(i)).activityInfo.packageName);
            context.startActivity(intent);
            basedialog.dismiss();
        }

        _cls6()
        {
            intent = intent1;
            apps = list;
            context = context1;
            super();
        }
    }


    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final Context val$context;
        final BaseDialog val$dialog;
        final Intent val$intent;

        public final void onItemClick(AdapterView adapterview, final View view, int i, long l)
        {
            int j;
            j = i;
            if (!Device.hasCamera())
            {
                j = i + 1;
            }
            j;
            JVM INSTR tableswitch 1 3: default 44
        //                       1 52
        //                       2 83
        //                       3 109;
               goto _L1 _L2 _L3 _L4
_L1:
            dialog.dismiss();
            return;
_L2:
            Pinalytics.a(ElementType.CAMERA_BUTTON, ComponentType.MODAL_DIALOG);
            class _cls1
                implements Runnable
            {

                final _cls3 this$0;
                final View val$view;

                public void run()
                {
                    CreateImageHelper.showCustomCameraDialog(view.getContext(), intent);
                }

                _cls1()
                {
                    this$0 = _cls3.this;
                    view = view1;
                    super();
                }
            }

            CreateImageHelper.tryUseCameraByJob((BaseActivity)context, new _cls1());
            continue; /* Loop/switch isn't completed */
_L3:
            Pinalytics.a(ElementType.GALLERY_BUTTON, ComponentType.MODAL_DIALOG);
            CreateImageHelper.tryCustomGalleryDialog((BaseActivity)context, intent);
            continue; /* Loop/switch isn't completed */
_L4:
            Pinalytics.a(ElementType.CAMERA_BUTTON, ComponentType.MODAL_DIALOG);
            class _cls2
                implements Runnable
            {

                final _cls3 this$0;
                final View val$view;

                public void run()
                {
                    Intent intent1 = new Intent(view.getContext(), com/pinterest/activity/create/PhotoGalleryActivity);
                    view.getContext().startActivity(intent1);
                }

                _cls2()
                {
                    this$0 = _cls3.this;
                    view = view1;
                    super();
                }
            }

            CreateImageHelper.tryUseCameraByJob((BaseActivity)context, new _cls2());
            if (true) goto _L1; else goto _L5
_L5:
        }

        _cls3()
        {
            context = context1;
            intent = intent1;
            dialog = basedialog;
            super();
        }
    }


    private class _cls5
        implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    {

        final BaseActivity val$activity;
        final List val$apps;
        final Intent val$intent;
        final PackageManager val$pm;

        public final void onRequestPermissionsResult(int i, String as[], int ai[])
        {
            if (PermissionUtil.checkPermission(activity, "android.permission.READ_EXTERNAL_STORAGE"))
            {
                CreateImageHelper.showCustomGalleryDialog(activity, pm, apps, intent);
            }
        }

        _cls5()
        {
            activity = baseactivity;
            pm = packagemanager;
            apps = list;
            intent = intent1;
            super();
        }
    }


    private class _cls2
        implements android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    {

        final BaseActivity val$activity;
        final Runnable val$job;

        public final void onRequestPermissionsResult(int i, String as[], int ai[])
        {
            if (PermissionUtil.checkPermissions(activity, PermissionUtil.getCameraUsagePermissionGroup()))
            {
                job.run();
            }
        }

        _cls2()
        {
            activity = baseactivity;
            job = runnable;
            super();
        }
    }

}

.class public Lcom/ijoysoft/appwall/GiftActivity;
.super Landroid/app/Activity;


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field private static e:Ljava/util/ArrayList;

.field private static f:Landroid/content/SharedPreferences;


# instance fields
.field private d:Lcom/ijoysoft/appwall/GiftActivity$AppBroadcastReceiver;

.field private g:Landroid/widget/ImageView;

.field private h:Lcom/ijoysoft/appwall/p;

.field private i:Landroid/widget/GridView;

.field private j:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    sput-object v0, Lcom/ijoysoft/appwall/GiftActivity;->e:Ljava/util/ArrayList;

    const-string v0, "http://1.appgift.sinaapp.com/"

    sput-object v0, Lcom/ijoysoft/appwall/GiftActivity;->a:Ljava/lang/String;

    const-string v0, "giftList.xml"

    sput-object v0, Lcom/ijoysoft/appwall/GiftActivity;->b:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/gift/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ijoysoft/appwall/GiftActivity;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    new-instance v0, Lcom/ijoysoft/appwall/j;

    invoke-direct {v0, p0}, Lcom/ijoysoft/appwall/j;-><init>(Lcom/ijoysoft/appwall/GiftActivity;)V

    iput-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->j:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a()Landroid/content/SharedPreferences;
    .locals 1

    sget-object v0, Lcom/ijoysoft/appwall/GiftActivity;->f:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic a(Lcom/ijoysoft/appwall/GiftActivity;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->g:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic a(Landroid/content/SharedPreferences;)V
    .locals 0

    sput-object p0, Lcom/ijoysoft/appwall/GiftActivity;->f:Landroid/content/SharedPreferences;

    return-void
.end method

.method public static a(Ljava/util/ArrayList;)V
    .locals 0

    sput-object p0, Lcom/ijoysoft/appwall/GiftActivity;->e:Ljava/util/ArrayList;

    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v2, :cond_1

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    invoke-interface {v3, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    :goto_1
    return v0

    :cond_0
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    const-string v0, "com.skype.android.verizon"

    invoke-direct {p0, p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.skype.android.verizon"

    const-string v3, "com.skype.android.verizon.SkypeActivity"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/ijoysoft/appwall/GiftActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_2
    const/4 v0, 0x1

    goto :goto_1
.end method

.method static synthetic b(Lcom/ijoysoft/appwall/GiftActivity;)Lcom/ijoysoft/appwall/p;
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->h:Lcom/ijoysoft/appwall/p;

    return-object v0
.end method

.method private c(Ljava/util/ArrayList;)I
    .locals 5

    const/4 v2, 0x0

    const-string v0, "settings"

    invoke-virtual {p0, v0, v2}, Lcom/ijoysoft/appwall/GiftActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    if-eqz p1, :cond_2

    move v1, v2

    move v3, v2

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    :goto_1
    return v3

    :cond_0
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    add-int/lit8 v3, v3, 0x1

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    move v3, v2

    goto :goto_1
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/ijoysoft/appwall/GiftActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.android.vending"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/ijoysoft/appwall/GiftActivity;->startActivity(Landroid/content/Intent;)V

    :goto_1
    return-void

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "https://play.google.com/store/apps/details?id="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v1, "com.android.vending"

    const-string v2, "com.google.android.finsky.activities.MainActivity"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, ""

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/ijoysoft/appwall/GiftActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v2, 0x2000

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final b(Ljava/util/ArrayList;)V
    .locals 6

    const/4 v5, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v1, v2

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v1, v0, :cond_1

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->h:Lcom/ijoysoft/appwall/p;

    invoke-virtual {v0, v3}, Lcom/ijoysoft/appwall/p;->a(Ljava/util/ArrayList;)V

    sput-object v3, Lcom/ijoysoft/appwall/GiftActivity;->e:Ljava/util/ArrayList;

    const-string v0, "settings"

    invoke-virtual {p0, v0, v2}, Lcom/ijoysoft/appwall/GiftActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "changle-jar"

    const-string v4, "new : true"

    invoke-static {v0, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "APP is installed"

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    :goto_1
    const-string v0, "title"

    invoke-virtual {p0, v0, v2}, Lcom/ijoysoft/appwall/GiftActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "title_num"

    invoke-direct {p0, v3}, Lcom/ijoysoft/appwall/GiftActivity;->c(Ljava/util/ArrayList;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->j:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :goto_2
    return-void

    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_0

    :cond_3
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Lcom/ijoysoft/appwall/GiftActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->h:Lcom/ijoysoft/appwall/p;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/p;->notifyDataSetChanged()V

    goto :goto_1

    :cond_4
    invoke-static {}, Lcom/ijoysoft/appwall/x;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/ijoysoft/appwall/x;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/ijoysoft/appwall/v;

    new-instance v4, Lcom/ijoysoft/appwall/n;

    invoke-direct {v4, p0}, Lcom/ijoysoft/appwall/n;-><init>(Lcom/ijoysoft/appwall/GiftActivity;)V

    invoke-direct {v3, v4}, Lcom/ijoysoft/appwall/v;-><init>(Lcom/ijoysoft/appwall/w;)V

    new-array v4, v5, [Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v2

    invoke-virtual {v3, v4}, Lcom/ijoysoft/appwall/v;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    invoke-virtual {v3}, Lcom/ijoysoft/appwall/v;->getStatus()Landroid/os/AsyncTask$Status;

    goto :goto_2
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    const/4 v5, 0x0

    const/4 v4, 0x1

    invoke-virtual {p0, v4}, Lcom/ijoysoft/appwall/GiftActivity;->requestWindowFeature(I)Z

    sget v0, Lcom/ijoysoft/appwall/ac;->a:I

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->setContentView(I)V

    new-instance v0, Lcom/ijoysoft/appwall/GiftActivity$AppBroadcastReceiver;

    invoke-direct {v0, p0}, Lcom/ijoysoft/appwall/GiftActivity$AppBroadcastReceiver;-><init>(Lcom/ijoysoft/appwall/GiftActivity;)V

    iput-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->d:Lcom/ijoysoft/appwall/GiftActivity$AppBroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "package"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ijoysoft/appwall/GiftActivity;->d:Lcom/ijoysoft/appwall/GiftActivity$AppBroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Lcom/ijoysoft/appwall/GiftActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    sget v0, Lcom/ijoysoft/appwall/ab;->f:I

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->g:Landroid/widget/ImageView;

    sget v0, Lcom/ijoysoft/appwall/ab;->b:I

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->findViewById(I)Landroid/view/View;

    sget v0, Lcom/ijoysoft/appwall/ab;->c:I

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->i:Landroid/widget/GridView;

    new-instance v0, Lcom/ijoysoft/appwall/p;

    iget-object v1, p0, Lcom/ijoysoft/appwall/GiftActivity;->i:Landroid/widget/GridView;

    invoke-direct {v0, p0, v1}, Lcom/ijoysoft/appwall/p;-><init>(Landroid/content/Context;Landroid/widget/GridView;)V

    iput-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->h:Lcom/ijoysoft/appwall/p;

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->i:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/ijoysoft/appwall/GiftActivity;->h:Lcom/ijoysoft/appwall/p;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->i:Landroid/widget/GridView;

    new-instance v1, Lcom/ijoysoft/appwall/l;

    invoke-direct {v1, p0}, Lcom/ijoysoft/appwall/l;-><init>(Lcom/ijoysoft/appwall/GiftActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    sget v0, Lcom/ijoysoft/appwall/ab;->a:I

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/ijoysoft/appwall/m;

    invoke-direct {v1, p0}, Lcom/ijoysoft/appwall/m;-><init>(Lcom/ijoysoft/appwall/GiftActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->j:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    sget-object v0, Lcom/ijoysoft/appwall/GiftActivity;->e:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->b(Ljava/util/ArrayList;)V

    invoke-static {p0}, Lcom/ijoysoft/appwall/a;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    sput-boolean v4, Lcom/ijoysoft/appwall/a;->b:Z

    invoke-static {}, Lcom/ijoysoft/appwall/x;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/ijoysoft/appwall/x;->c()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/ijoysoft/appwall/v;

    new-instance v3, Lcom/ijoysoft/appwall/k;

    invoke-direct {v3, p0}, Lcom/ijoysoft/appwall/k;-><init>(Lcom/ijoysoft/appwall/GiftActivity;)V

    invoke-direct {v2, v3}, Lcom/ijoysoft/appwall/v;-><init>(Lcom/ijoysoft/appwall/w;)V

    new-array v3, v4, [Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v5

    invoke-virtual {v2, v3}, Lcom/ijoysoft/appwall/v;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    invoke-virtual {v2}, Lcom/ijoysoft/appwall/v;->getStatus()Landroid/os/AsyncTask$Status;

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->d:Lcom/ijoysoft/appwall/GiftActivity$AppBroadcastReceiver;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/appwall/GiftActivity;->d:Lcom/ijoysoft/appwall/GiftActivity$AppBroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method protected onResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    return-void
.end method

.method protected onStop()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "popularize.newnum2"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "newnum2"

    new-instance v2, Ljava/lang/StringBuilder;

    sget-object v3, Lcom/ijoysoft/appwall/GiftActivity;->e:Ljava/util/ArrayList;

    invoke-direct {p0, v3}, Lcom/ijoysoft/appwall/GiftActivity;->c(Ljava/util/ArrayList;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/ijoysoft/appwall/GiftActivity;->sendBroadcast(Landroid/content/Intent;)V

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    return-void
.end method

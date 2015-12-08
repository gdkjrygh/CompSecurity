// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.dc;
import com.google.android.gms.internal.dg;
import com.google.android.gms.internal.ek;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Referenced classes of package com.google.android.gms.common:
//            GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException

public final class GooglePlayServicesUtil
{

    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0x3d8024;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final byte iQ[][] = {
        t("0\202\004C0\202\003+\240\003\002\001\002\002\t\000\302\340\207FdJ0\2150\r\006\t*\206H\206\367\r\001\001\004\005\0000t1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android0\036\027\r080821231334Z\027\r360107231334Z0t1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android0\202\001 0\r\006\t*\206H\206\367\r\001\001\001\005\000\003\202\001\r\0000\202\001\b\002\202\001\001\000\253V.\000\330;\242\b\256\n\226o\022N)\332\021\362\253V\320\217X\342\314\251\023\003\351\267T\323r\366@\247\033\035\313\023\tgbNFV\247wj\222\031=\262\345\277\267$\251\036w\030\213\016jG\244;3\331`\233w\0301E\314\337{.Xft\311\341V[\037LjYU\277\362Q\246=\253\371\305\\'\"\"R\350u\344\370\025Jd_\211qh\300\261\277\306\022\352\277xWi\2734\252y\204\334~.\242vL\256\203\007\330\301qT\327\356_d\245\032D\246\002\302I\005AW\334\002\315_\\\016U\373\357\205\031\373\343'\360\261Q\026\222\305\240o\031\321\203\205\365\304\333\302\326\271?h\314)y\307\016\030\253\223\206k;\325\333\211\231U*\016;L\231\337X\373\221\213\355\301\202\2725\340\003\301\264\261\r\322D\250\356$\377\37538r\253R!\230^\332\260\374\r\013\024[j\241\222\205\216y\002\001\003\243\201\3310\201\3260\035\006\003U\035\016\004\026\004\024\307}\214\302!\027V%\232\177\323\202\337k\343\230\344\327\206\2450\201\246\006\003U\035#\004\201\2360\201\233\200\024\307}\214\302!\027V%\232\177\323\202\337k\343\230\344\327\206\245\241x\244v0t1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android\202\t\000\302\340\207FdJ0\2150\f\006\003U\035\023\004\0050\003\001\001\3770\r\006\t*\206H\206\367\r\001\001\004\005\000\003\202\001\001\000m\322R\316\357\2050,6\n\252\316\223\233\317\362\314\251\004\273]z\026a\370\256F\262\231B\004\320\377Jh\307\355\032S\036\304YZb<\346\007c\261g)zz\343W\022\304\007\362\b\360\313\020\224)\022M{\020b\031\300\204\312>\263\371\255_\270q\357\222&\232\213\342\213\361mD\310\331\240\216l\262\360\005\273?\342\313\226D~\206\216s\020v\255E\263?`\t\352\031\301a\346&A\252\231'\035\375R(\305\305\207\207]\333\177E'X\326a\366\314\f\314\2675.BL\3046\\R52\3672Q7Y<J\343A\364\333A\355\332\r\013\020q\247\304@\360\376\236\240\034\266'\312gCi\320\204\275/\331\021\377\006\315\277,\372\020\334\017\211:\343Wb\221\220H\307\357\306LqD\027\203B\367\005\201\311\336W:\365[9\r\327\375\271A\2061\211]_u\2370\021&\207\377b\024\020\300i0\212"), t("0\202\004\2500\202\003\220\240\003\002\001\002\002\t\000\325\205\270l}\323N\3650\r\006\t*\206H\206\367\r\001\001\004\005\0000\201\2241\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0200\016\006\003U\004\n\023\007Android1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android1\"0 \006\t*\206H\206\367\r\001\t\001\026\023android@android.com0\036\027\r080415233656Z\027\r350901233656Z0\201\2241\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0200\016\006\003U\004\n\023\007Android1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android1\"0 \006\t*\206H\206\367\r\001\t\001\026\023android@android.com0\202\001 0\r\006\t*\206H\206\367\r\001\001\001\005\000\003\202\001\r\0000\202\001\b\002\202\001\001\000\326\316.\b\n\277\3421M\321\215\263\317\323\030\\\264=3\372\ft\341\275\266\321\333\211\023\366,\\9\337V\370F\201=e\276\300\363\312Bk\007\305\250\355Z9\220\301g\347k\311\231\271'\211K\217\013\"\000\031\224\251)\025\345r\305m*0\033\243o\305\374\021:\326\313\236t5\241m#\253}\372\356\341e\344\337\037\n\215\275\247\n\206\235QlN\235\005\021\226\312|\fU\177\027[\303u\371H\305j\256\206\b\233\244O\212\246\244\335\232}\277,\n5\"\202\255\006\270\314\030^\261Uy\356\370m\b\013\035a\211\300\371\257\230\261\302\353\321\007\352E\253\333h\243\307\203\212^T\210\307lS\324\013\022\035\347\273\323\016b\f\030\212\341\252a\333\274\207\335<d_/U\363\324\303u\354@p\251?qQ\3306p\301j\227\032\276^\362\321\030\220\341\270\256\363)\214\360f\277\236l\341D\254\232\350m\034\033\017\002\001\003\243\201\3740\201\3710\035\006\003U\035\016\004\026\004\024\215\034\305\276\225LC<a\206:\025\260L\274\003\362O\340\2620\201\311\006\003U\035#\004\201\3010\201\276\200\024\215\034\305\276\225LC<a\206:\025\260L\274\003\362O\340\262\241\201\232\244\201\2270\201\2241\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0200\016\006\003U\004\n\023\007Android1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android1\"0 \006\t*\206H\206\367\r\001\t\001\026\023android@android.com\202\t\000\325\205\270l}\323N\3650\f\006\003U\035\023\004\0050\003\001\001\3770\r\006\t*\206H\206\367\r\001\001\004\005\000\003\202\001\001\000\031\323\f\361\005\373x\222?L\r}\322##=@\226z\317\316\000\b\035[\327\306\351\326\355 k\016\021 \225\006Al\242D\223\231\023\322kJ\240\340\365$\312\322\273\\nL\241\001j\025\221n\241\354]\311Z^:\001\0006\364\222H\325\020\233\277.\036a\201\206g:;\345m\257\013w\261\302)\343\302U\343\350L\220]#\207\357\272\t\313\361; +NZ\"\3112cHJ#\322\374)\372\237\0319u\2273\257\330\252\026\017B\226\302\320\026>\201\202\205\234fC\351\301\226/\240\301\20333[\300\220\377\232k\"\336\321\255DB)\2459\251N\357\255\253\320e\316\322K>Q\345\335{fx{\357\022\376\227\373\244\204\304#\373O\370\314IL\002\360\365\005\026\022\377e)9>\216F\352\305\273!\362w\301Q\252_*\246'\321\350\235\247\n\266\0035i\336;\230\227\277\377|\251\332>\022C\366\013")
    };
    static final byte iR[][] = {
        t("0\202\002R0\202\001\273\002\004I4\230~0\r\006\t*\206H\206\367\r\001\001\004\005\0000p1\0130\t\006\003U\004\006\023\002US1\0130\t\006\003U\004\b\023\002CA1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google, Inc1\0240\022\006\003U\004\013\023\013Google, Inc1\0200\016\006\003U\004\003\023\007Unknown0\036\027\r081202020758Z\027\r360419020758Z0p1\0130\t\006\003U\004\006\023\002US1\0130\t\006\003U\004\b\023\002CA1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google, Inc1\0240\022\006\003U\004\013\023\013Google, Inc1\0200\016\006\003U\004\003\023\007Unknown0\201\2370\r\006\t*\206H\206\367\r\001\001\001\005\000\003\201\215\0000\201\211\002\201\201\000\237H\003\031\220\371\261G&8N\004S\321\217\214\013\277\215\307{%\004\244\261 |LlD\272\274\000\255\306a\017\246\266\253-\250\0163\362\356\361k&\243\366\270[\232\372\312\220\237\373\276\263\364\311O~\201\"\247\230\340\353\247\\\355=\322)\372se\364\025\026AZ\251\301a}\325\203\316\031\272\350\240\273\330\205\374\027\251\264\275&@\200Q!\252\333\223w\336\264\000\0238\024\030\210.\305\"\202\374X\r\002\003\001\000\0010\r\006\t*\206H\206\367\r\001\001\004\005\000\003\201\201\000@\206f\236\3261\332C\204\335\320a\322&\340s\271\214\304\271\235\370\265\344\276\236<\276\227P\036\203\337\034o\251Y\300\316`\\O\322\254m\034\204\316\336 Gl\272\261\233\350\362 :\377w\027\255e-\217\314\211\007\b\321!m\250DWY&I\340\351\323\304\273L\365\215\241\235\261\324\374A\274\271XOd\346_A\r\005)\375[h\203\214\024\035\n\233\321\333\021\221\313*\r\367\220\352\f\261-\263\244"), t("0\202\004\2500\202\003\220\240\003\002\001\002\002\t\000\204~O\362\326\265\336\2160\r\006\t*\206H\206\367\r\001\001\005\005\0000\201\2241\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0200\016\006\003U\004\n\023\007Android1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android1\"0 \006\t*\206H\206\367\r\001\t\001\026\023android@android.com0\036\027\r100120010135Z\027\r370607010135Z0\201\2241\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0200\016\006\003U\004\n\023\007Android1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android1\"0 \006\t*\206H\206\367\r\001\t\001\026\023android@android.com0\202\001 0\r\006\t*\206H\206\367\r\001\001\001\005\000\003\202\001\r\0000\202\001\b\002\202\001\001\000\330(q|6\321\027\017\324M\n{\017\007\021&\350[\277\3373\2604`\000Z\224\314\373e\245\333\240\262C\337`\261\221\277\235\006\337\035\212\\\n3\342\321c\365\023\337\035\"SA\352<3y\"\350\\\002\3544\316\331L\270\007#\246#\377K\257\373\264\345\357\346w;>\242\276\270\274\262\002g\317\347\205Q\037\203.\371\207\253u\224\376\036)\317\274M\b:\037\022R\000ws\226\362\026[i{\000\243\240\301:\3140\212\223\362!c\301n\234=J\262\024\2376LE\300C\0242p9\361\332\t`\223\361\263\374\030\266V\020\225\306\"_\307\020+\230|o\023\244]$\343\340\305N\205\235g\343[g\b'\023\322\326\360W\3354W\321\237\304\376\215\335\354\214:O?\227#\005\031\247\n(64\2545\201\243J\275\241}\204Z\n\t\205\373\370\006\013\003j'x`\201c\372\f7\271\347\362\241\016v\274w\002\001\003\243\201\3740\201\3710\035\006\003U\035\016\004\026\004\024\265\307\371\022ox\r:\373\312ess?\365\"k\233\02770\201\311\006\003U\035#\004\201\3010\201\276\200\024\265\307\371\022ox\r:\373\312ess?\365\"k\233\0277\241\201\232\244\201\2270\201\2241\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0200\016\006\003U\004\n\023\007Android1\0200\016\006\003U\004\013\023\007Android1\0200\016\006\003U\004\003\023\007Android1\"0 \006\t*\206H\206\367\r\001\t\001\026\023android@android.com\202\t\000\204~O\362\326\265\336\2160\f\006\003U\035\023\004\0050\003\001\001\3770\r\006\t*\206H\206\367\r\001\001\005\005\000\003\202\001\001\000L>\247e}&\346\273\327\021\f\217\031\337\037\215\241\t}3\206\017i\336\277\312\333F\243~\207\345\263\017\2734{\034uU\274\273<\231T\024\200F\226_\234y*\002\320\333\345\246Ga\263yG\253k\377\260\272\306\242\301\240\315\370b\370w\251g\r\375o\006.@n\316\030\006\f`I\215\3746\237'\021q\230\345o\313\241R\346\005\215\316\224\316Y\037\304\364\251\230+3\272\330\031mwoU\267\320\032\3171\335\327\f\354\267\211xv\006e\020\371I\245RJ11\263\313eA\317\2135B\016\274\304R%Y\226?Bfi\005rfbO\263\230\317\333R\027\210\035\021\034n\003F\026\370Q!\030\320\242\246\235\023\327\222\360\315\021\333\325\216#\203ZT\245J\302Q\347\322,Dj?\356\024\022\020\351DGK@c\007\273&\204+Ok\323U\202\034s\226Q\377\242`[\005\342$\225\327\025\330z\221\366")
    };
    static final byte iS[][] = {
        t("0\202\002\2470\202\002e\240\003\002\001\002\002\004P\005|B0\013\006\007*\206H\3168\004\003\005\000071\0130\t\006\003U\004\006\023\002US1\0200\016\006\003U\004\n\023\007Android1\0260\024\006\003U\004\003\023\rAndroid Debug0\036\027\r120717145250Z\027\r220715145250Z071\0130\t\006\003U\004\006\023\002US1\0200\016\006\003U\004\n\023\007Android1\0260\024\006\003U\004\003\023\rAndroid Debug0\202\001\2670\202\001,\006\007*\206H\3168\004\0010\202\001\037\002\201\201\000\375\177S\201\035u\022)R\337J\234.\354\344\347\366\021\267R<\357D\000\303\036?\200\266Q&iE]@\"Q\373Y=\215X\372\277\305\365\2720\366\313\233Ul\327\201;\200\0354o\362f`\267k\231P\245\244\237\237\350\004{\020\"\302O\273\251\327\376\267\306\033\370;W\347\306\250\246\025\017\004\373\203\366\323\305\036\303\0025T\023Z\026\2212\366u\363\256+a\327*\357\362\"\003\031\235\321H\001\307\002\025\000\227`P\217\025#\013\314\262\222\271\202\242\353\204\013\360X\034\365\002\201\201\000\367\341\240\205\326\233=\336\313\274\253\\6\270W\271y\224\257\273\372:\352\202\371WL\013=\007\202gQYW\216\272\324YO\346q\007\020\201\200\264I\026q#\350L(\026\023\267\317\t2\214\310\246\341<\026z\213T|\215(\340\243\256\036+\263\246u\221n\243\177\013\372!5b\361\373bz\001$;\314\244\361\276\250Q\220\211\250\203\337\341Z\345\237\006\222\213f^\200{U%d\001L;\376\317I*\003\201\204\000\002\201\200j\321\033\327\325f\322z\3649\300.Ah\254\375E\264\276\205\274\231\214{\233\216\034wTi?\214\rB\212\244\374\341\020\204\2018BO\246\214\3210RN\357\366\36178c\202/\2467)\213\376MF\240\270fe\356\360A\0279\001\003[\034\200j\243\030\030\r0:\250\314\236Y#\340jo\253\372uh<E;\262\007w|\362\375\347\317\261\233\02408\024\252\035\367\264=[\"+W\006\264\213\2240\013\006\007*\206H\3168\004\003\005\000\003/\0000,\002\024\t\322\321\260G\002)\265\276\322\220&a\321\022\362p\305\346\035\002\024gP\002\006\247\200P\272x\256\307\027O\026\004\177\204\352\242\367")
    };
    static final byte iT[][] = {
        t("0\202\004L0\202\0034\240\003\002\001\002\002\t\000\250\315\027\311=\245\331\2200\r\006\t*\206H\206\367\r\001\001\005\005\0000w1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0230\021\006\003U\004\003\023\nGoogle NFC0\036\027\r110324010653Z\027\r380809010653Z0w1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0230\021\006\003U\004\003\023\nGoogle NFC0\202\001 0\r\006\t*\206H\206\367\r\001\001\001\005\000\003\202\001\r\0000\202\001\b\002\202\001\001\000\303\017\210\255\331\264\222\tj,XjZ\232\2005k\372\002iX\370\377\f]\372\365\237I&\212\330p\336\350!\245>\037[\027\017\311bE\243\311\202\247\313E'\005;\343^4\363\226\322K\"\221\354\fR\215n&\222te\340hu\352b\037\177\371\214@\3434[ I\007\314\223Tt:\315\252\316eV_H\272t\315A!\315\310v\3375\"\272\333\t\\ \3314\305j>\\9>\345\360\340/\217\340b\037\221\215\0375\250$\211%,o\246\2663\222\247hk>Ha-\006\251\317oI\277\361\035]\226(\234\235\376\024\254WbC\226\227\335)\352\375\271\201\r\343&5\023\251\005\254\216\216\257 \220~Fu\nZ\267\277\232w&/G\260?Z<nm{Q4?i\307\367%\367\013\314\033J\325\222%\013pZ\206\346\350>\342\2567\376W\001\274\275\262o\356\375\377\366\017j[\337\265\266G\223\002\001\003\243\201\3340\201\3310\035\006\003U\035\016\004\026\004\024\034\316\316\016\352M\301\022\037\307Q_\r\n\fr\340\214\311m0\201\251\006\003U\035#\004\201\2410\201\236\200\024\034\316\316\016\352M\301\022\037\307Q_\r\n\fr\340\214\311m\241{\244y0w1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0230\021\006\003U\004\003\023\nGoogle NFC\202\t\000\250\315\027\311=\245\331\2200\f\006\003U\035\023\004\0050\003\001\001\3770\r\006\t*\206H\206\367\r\001\001\005\005\000\003\202\001\001\000\244p\307(\341\323\033\006\331\257j\347h\265e\004lW\200k\230CrI1\327]L\241\f2\025 \323<\317\355*\246Tb#L\236\371\266\371\020\314gk\231\313\177\230\225\326\300gcWO\273x3\022u\334\\\363\217\272\251\030\327\223\214\005\037\373\242\255\350\363\003\315\350\331\346\212\004\215\037\333\236|\237*I\262\"\306\217\377B+\361Ui\270^\356\355\260J\243\bs\333\346K\234\236t\370\362\302\366\304\001$\252\250\321x\r\030Q+T\n\335(\263\351X\031q\244\027\r\330h\317_1\344G\022\262\302;\265\0207\327\357\237\207\246\345\275\263^,\353k\260\"cl\027\245j\226\274zP%\214\013\322\355{1UZ\030E.\0272\032\rR\203\214\202\366?t-t\377yXj\\\273\177\257q\230\250K\317tC\020\351\351'Y\177\000\242=\320\006`\200\f\"8\331\013/\263r\337\333\272u\275\205."), t("0\202\004L0\202\0034\240\003\002\001\002\002\t\000\336v\225\004\035vP\3000\r\006\t*\206H\206\367\r\001\001\005\005\0000w1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0230\021\006\003U\004\003\023\nGoogle NFC0\036\027\r110324010324Z\027\r380809010324Z0w1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0230\021\006\003U\004\003\023\nGoogle NFC0\202\001 0\r\006\t*\206H\206\367\r\001\001\001\005\000\003\202\001\r\0000\202\001\b\002\202\001\001\000\346\377=\357\351*\241\rq\353\017\246@\213\3006\267\342C\356\355h\246\244v=\307\245*1u|\332\306\037\345\020\273s\307\026\344\000\001\004&[4\177\316\316\364\304+\361\3417\235\320\250v\360(\"\177\273\301\371\275\325\327\023\262\366\2515\243y\322\313\251\311o\222\322\320x|\021\361\353\031T\200\b\246\240r\263K\221\203l\372\n\341'g\200\351\000u0\026i\206\241\034\234\357F\316\367\307\004\200m\336\2241\373`(M\022\n\260\347\336\035c?\007h}F\214Q\023\232\377\375\306\274\232 |\251\004\270\276\035\240\252{N\227uoC`d\210\276\\\256<h\350\273yB\315\365\026\007\3110\242\374\332e[u\320u\234\272\211\255\006\3479\275\013\242\233\037@B\226\302\300\250Z\204\177Z\260\320g\306\303\354\234I! B\254c\247\345;Tle\264`\200\264\343\346\200\342>\037w\317\347\366\336tK\032e\002\001\003\243\201\3340\201\3310\035\006\003U\035\016\004\026\004\024\242\350\220d\260]\b\206\\4\333\223\n\235\204\000P\021z\3540\201\251\006\003U\035#\004\201\2410\201\236\200\024\242\350\220d\260]\b\206\\4\333\223\n\235\204\000P\021z\354\241{\244y0w1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0240\022\006\003U\004\n\023\013Google Inc.1\0200\016\006\003U\004\013\023\007Android1\0230\021\006\003U\004\003\023\nGoogle NFC\202\t\000\336v\225\004\035vP\3000\f\006\003U\035\023\004\0050\003\001\001\3770\r\006\t*\206H\206\367\r\001\001\005\005\000\003\202\001\001\0007q\207\f\350|<R\352\204\211\2220\306\351b\331KM_\022\223\302]\210&\025A\375\220\265U]\022\205\316\363\2701,?]\366\221\250\252\340L\271\201\263\005\344'\375\035-\236\031\207\341\322\220x\361<\204R\231\017\030!\230\002c\330\324\2756Q\223H\330\330\272&\330\271\237\277\t\365\375>\273\016\243\302\360\3117o\036\037\312v\363\246\244\005B\235\b\033u*z\220\267V\351\253D\332A\253\310\341\350\370\212\302u\215\247C\373s\346Pq\232W\204\f\313kz\335!\271\237\306\201\344V\341\207,\"=\\\007J\337U\366\253\332&\214-\213d\352\n\210E\356\315\226\217\222\264\223\022~u\307S\303\3770\313\306x\265\034\237R\226\024r\361}\242\n\r\306'J\242F44\301\251\266\024\337i}\217\365\312\201\001\347\242\\}\263\373\005]eV\234\004\260\0358\234\253\272W\263\241p>\302\347J\210\3234")
    };
    private static final byte iU[][] = a(new byte[][][] {
        iQ, iR, iS, iT
    });
    private static final byte iV[][] = {
        iQ[0], iR[0], iT[0]
    };
    static final byte iW[][] = {
        t("0\202\002_0\202\001\310\240\003\002\001\002\002\004K\031\261\2350\r\006\t*\206H\206\367\r\001\001\005\005\0000t1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0250\023\006\003U\004\n\023\fGoogle, Inc.1\0200\016\006\003U\004\013\023\007Unknown1\0170\r\006\003U\004\003\023\006Bazaar0\036\027\r091205010429Z\027\r370422010429Z0t1\0130\t\006\003U\004\006\023\002US1\0230\021\006\003U\004\b\023\nCalifornia1\0260\024\006\003U\004\007\023\rMountain View1\0250\023\006\003U\004\n\023\fGoogle, Inc.1\0200\016\006\003U\004\013\023\007Unknown1\0170\r\006\003U\004\003\023\006Bazaar0\201\2370\r\006\t*\206H\206\367\r\001\001\001\005\000\003\201\215\0000\201\211\002\201\201\000\251\b\210\336\226\34354w\t\335K%\036z)\250G7k.\\\272[[\325\004>\203\210\001\002\230\031\024\224\023\3723\252\345D;\003SJ\316J\255oP\227\022I\331\216v\243\232~L\314\341\327\033\247\276>ugM\265\361\007Z\230sp\001FH\247\316p<-\307\2104\211\005\222\022\257\234l[(\253\325O\203d\021\3101\242\237P\017(\002\321l\346\321\205o\206p\252\374\242eA\203{9\002\003\001\000\0010\r\006\t*\206H\206\367\r\001\001\005\005\000\003\201\201\000I\204\306\363AG\001#b:'O\351\3417=u1\314\r\374\351\247j\346\177\373p[@L\275\033\301\026\214\253\030\273\021\303x\225\277\264\363l\301L\354\035,\305Qj\016\316\324\007N\265h\202\211Pd\000\257\370\334\310\357T\004\022\002\375\357\361\375\202\340\363#\020r\375\314\336J6\213\340\306\303\371\270\263\252\rh<:\277\332\232\267\273\2102\351\276^6\031\272\222\335:\314\003j\255\265\246\031\257P")
    };
    public static boolean iX = false;
    public static boolean iY = false;
    static boolean iZ = false;
    private static int ja = -1;
    private static final Object jb = new Object();

    private GooglePlayServicesUtil()
    {
    }

    public static Dialog a(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener, int k)
    {
        android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(activity)).setMessage(b(activity, i, k));
        if (oncancellistener != null)
        {
            builder.setOnCancelListener(oncancellistener);
        }
        oncancellistener = new dc(activity, a(((Context) (activity)), i, k), j);
        activity = b(activity, i);
        if (activity != null)
        {
            builder.setPositiveButton(activity, oncancellistener);
        }
        switch (i)
        {
        default:
            Log.e("GooglePlayServicesUtil", (new StringBuilder()).append("Unexpected error code ").append(i).toString());
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_unknown_issue).create();

        case 0: // '\0'
            return null;

        case 4: // '\004'
        case 6: // '\006'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_unknown_issue).create();

        case 1: // '\001'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_install_title).create();

        case 3: // '\003'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_enable_title).create();

        case 2: // '\002'
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_update_title).create();

        case 9: // '\t'
            Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_unsupported_title).create();

        case 7: // '\007'
            Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_network_error_title).create();

        case 8: // '\b'
            Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_unknown_issue).create();

        case 10: // '\n'
            Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_unknown_issue).create();

        case 5: // '\005'
            Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_invalid_account_title).create();

        case 11: // '\013'
            Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
            return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_unknown_issue).create();

        case 12: // '\f'
            Log.e("GooglePlayServicesUtil", "The date of the device is not valid.");
            break;
        }
        return builder.setTitle(com.google.android.gms.R.string.common_google_play_services_unsupported_title).create();
    }

    public static Intent a(Context context, int i, int j)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            if (n(j))
            {
                if (o(context))
                {
                    return dg.C("com.google.android.gms");
                } else
                {
                    return dg.B("com.google.android.apps.bazaar");
                }
            } else
            {
                return dg.B("com.google.android.gms");
            }

        case 3: // '\003'
            return dg.z("com.google.android.gms");

        case 12: // '\f'
            return dg.bj();
        }
    }

    public static boolean a(Resources resources)
    {
        boolean flag1 = false;
        boolean flag;
        if ((resources.getConfiguration().screenLayout & 0xf) > 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ek.bJ() && flag || b(resources))
        {
            flag1 = true;
        }
        return flag1;
    }

    private static transient byte[] a(PackageInfo packageinfo, byte abyte0[][])
    {
        Object obj;
        try
        {
            obj = CertificateFactory.getInstance("X509");
        }
        // Misplaced declaration of an exception variable
        catch (PackageInfo packageinfo)
        {
            Log.w("GooglePlayServicesUtil", "Could not get certificate instance.");
            return null;
        }
        if (packageinfo.signatures.length != 1)
        {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(packageinfo.signatures[0].toByteArray());
        try
        {
            obj = (X509Certificate)((CertificateFactory) (obj)).generateCertificate(bytearrayinputstream);
        }
        // Misplaced declaration of an exception variable
        catch (PackageInfo packageinfo)
        {
            Log.w("GooglePlayServicesUtil", "Could not generate certificate.");
            return null;
        }
        try
        {
            ((X509Certificate) (obj)).checkValidity();
        }
        // Misplaced declaration of an exception variable
        catch (PackageInfo packageinfo)
        {
            Log.w("GooglePlayServicesUtil", "Certificate has expired.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (PackageInfo packageinfo)
        {
            Log.w("GooglePlayServicesUtil", "Certificate is not yet valid.");
            return null;
        }
        packageinfo = packageinfo.signatures[0].toByteArray();
        for (int i = 0; i < abyte0.length; i++)
        {
            byte abyte1[] = abyte0[i];
            if (Arrays.equals(abyte1, packageinfo))
            {
                return abyte1;
            }
        }

        if (Log.isLoggable("GooglePlayServicesUtil", 2))
        {
            Log.v("GooglePlayServicesUtil", (new StringBuilder()).append("Signature not valid.  Found: \n").append(Base64.encodeToString(packageinfo, 0)).toString());
        }
        return null;
    }

    private static transient byte[][] a(byte abyte0[][][])
    {
        int k = abyte0.length;
        int i = 0;
        int j = 0;
        for (; i < k; i++)
        {
            j += abyte0[i].length;
        }

        byte abyte1[][] = new byte[j][];
        int i1 = abyte0.length;
        j = 0;
        i = 0;
        for (; j < i1; j++)
        {
            byte abyte2[][] = abyte0[j];
            for (int l = 0; l < abyte2.length;)
            {
                abyte1[i] = abyte2[l];
                l++;
                i++;
            }

        }

        return abyte1;
    }

    public static boolean aI()
    {
        if (iX)
        {
            return iY;
        } else
        {
            return "user".equals(Build.TYPE);
        }
    }

    public static String b(Context context, int i)
    {
        context = context.getResources();
        switch (i)
        {
        default:
            return context.getString(0x104000a);

        case 1: // '\001'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_install_button);

        case 3: // '\003'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_enable_button);

        case 2: // '\002'
            return context.getString(com.google.android.gms.R.string.common_google_play_services_update_button);
        }
    }

    public static String b(Context context, int i, int j)
    {
        Object obj = context.getResources();
        i;
        JVM INSTR tableswitch 1 12: default 68
    //                   1 78
    //                   2 145
    //                   3 137
    //                   4 68
    //                   5 199
    //                   6 68
    //                   7 191
    //                   8 68
    //                   9 183
    //                   10 68
    //                   11 68
    //                   12 207;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L1 _L6 _L1 _L7 _L1 _L1 _L8
_L1:
        context = ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);
_L10:
        return context;
_L2:
        if (a(context.getResources()))
        {
            obj = ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_install_text_tablet);
        } else
        {
            obj = ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_install_text_phone);
        }
        context = ((Context) (obj));
        if (!n(j)) goto _L10; else goto _L9
_L9:
        return (new StringBuilder()).append(((String) (obj))).append(" (via Bazaar)").toString();
_L4:
        return ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_enable_text);
_L3:
        obj = ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_update_text);
        context = ((Context) (obj));
        if (!n(j)) goto _L10; else goto _L11
_L11:
        return (new StringBuilder()).append(((String) (obj))).append(" (via Bazaar)").toString();
_L7:
        return ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_unsupported_text);
_L6:
        return ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_network_error_text);
_L5:
        return ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_invalid_account_text);
_L8:
        return ((Resources) (obj)).getString(com.google.android.gms.R.string.common_google_play_services_unsupported_date_text);
    }

    private static boolean b(Resources resources)
    {
        boolean flag1 = false;
        resources = resources.getConfiguration();
        boolean flag = flag1;
        if (ek.bL())
        {
            flag = flag1;
            if ((((Configuration) (resources)).screenLayout & 0xf) <= 3)
            {
                flag = flag1;
                if (((Configuration) (resources)).smallestScreenWidthDp >= 600)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static Dialog getErrorDialog(int i, Activity activity, int j)
    {
        return a(i, activity, j, null, -1);
    }

    public static Dialog getErrorDialog(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        return a(i, activity, j, oncancellistener, -1);
    }

    public static PendingIntent getErrorPendingIntent(int i, Context context, int j)
    {
        Intent intent = a(context, i, -1);
        if (intent == null)
        {
            return null;
        } else
        {
            return PendingIntent.getActivity(context, j, intent, 0x10000000);
        }
    }

    public static String getErrorString(int i)
    {
        switch (i)
        {
        default:
            return "UNKNOWN_ERROR_CODE";

        case 0: // '\0'
            return "SUCCESS";

        case 1: // '\001'
            return "SERVICE_MISSING";

        case 2: // '\002'
            return "SERVICE_VERSION_UPDATE_REQUIRED";

        case 3: // '\003'
            return "SERVICE_DISABLED";

        case 4: // '\004'
            return "SIGN_IN_REQUIRED";

        case 5: // '\005'
            return "INVALID_ACCOUNT";

        case 6: // '\006'
            return "RESOLUTION_REQUIRED";

        case 7: // '\007'
            return "NETWORK_ERROR";

        case 8: // '\b'
            return "INTERNAL_ERROR";

        case 9: // '\t'
            return "SERVICE_INVALID";

        case 10: // '\n'
            return "DEVELOPER_ERROR";

        case 11: // '\013'
            return "LICENSE_CHECK_FAILED";

        case 12: // '\f'
            return "DATE_INVALID";
        }
    }

    public static String getOpenSourceSoftwareLicenseInfo(Context context)
    {
        Object obj = (new android.net.Uri.Builder()).scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build();
        InputStream inputstream = context.getContentResolver().openInputStream(((android.net.Uri) (obj)));
        try
        {
            context = (new Scanner(inputstream)).useDelimiter("\\A").next();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (inputstream == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            try
            {
                inputstream.close();
                break MISSING_BLOCK_LABEL_101;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                obj = null;
            }
            break MISSING_BLOCK_LABEL_99;
        }
        finally
        {
            if (inputstream == null) goto _L0; else goto _L0
        }
        obj = context;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        inputstream.close();
        return context;
        inputstream.close();
        throw context;
        return ((String) (obj));
        return null;
    }

    public static Context getRemoteContext(Context context)
    {
        try
        {
            context = context.createPackageContext("com.google.android.gms", 3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Resources getRemoteResource(Context context)
    {
        try
        {
            context = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static int isGooglePlayServicesAvailable(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        try
        {
            context.getResources().getString(com.google.android.gms.R.string.common_google_play_services_unknown_issue);
        }
        catch (Throwable throwable)
        {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (System.currentTimeMillis() < 0x11dc17eed20L)
        {
            return 12;
        }
        n(context);
        try
        {
            context = packagemanager.getPackageInfo("com.android.vending", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
            return 9;
        }
        context = a(context, iQ);
        if (context == null)
        {
            Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
            return 9;
        }
        PackageInfo packageinfo;
        try
        {
            packageinfo = packagemanager.getPackageInfo("com.google.android.gms", 64);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
        if (a(packageinfo, new byte[][] {
    context
}) == null)
        {
            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
            return 9;
        }
        if (packageinfo.versionCode < 0x3d8024)
        {
            Log.w("GooglePlayServicesUtil", (new StringBuilder()).append("Google Play services out of date.  Requires 4030500 but found ").append(packageinfo.versionCode).toString());
            return 2;
        }
        try
        {
            context = packagemanager.getApplicationInfo("com.google.android.gms", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
            context.printStackTrace();
            return 1;
        }
        return ((ApplicationInfo) (context)).enabled ? 0 : 3;
    }

    public static boolean isUserRecoverableError(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 9: // '\t'
        case 12: // '\f'
            return true;
        }
    }

    public static void m(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        int i = isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            context = a(context, i, -1);
            Log.e("GooglePlayServicesUtil", (new StringBuilder()).append("GooglePlayServices not available due to error ").append(i).toString());
            if (context == null)
            {
                throw new GooglePlayServicesNotAvailableException(i);
            } else
            {
                throw new GooglePlayServicesRepairableException(i, "Google Play Services not available", context);
            }
        } else
        {
            return;
        }
    }

    private static void n(Context context)
    {
        Object obj = null;
        try
        {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf("GooglePlayServicesUtil", "This should never happen.", context);
            context = obj;
        }
        context = ((ApplicationInfo) (context)).metaData;
        if (context != null)
        {
            int i = context.getInt("com.google.android.gms.version");
            if (i == 0x3d8024)
            {
                return;
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 4030500 but found ").append(i).append(".  You must have the").append(" following declaration within the <application> element: ").append("    <meta-data android:name=\"").append("com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        } else
        {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
    }

    static boolean n(int i)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        o(i);
        JVM INSTR tableswitch 0 2: default 36
    //                   0 40
    //                   1 38
    //                   2 50;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = false;
_L3:
        return flag;
_L2:
        flag = flag1;
        if (!aI()) goto _L3; else goto _L5
_L5:
        return false;
_L4:
        return false;
    }

    private static int o(int i)
    {
        int j = i;
        if (i == -1)
        {
            j = 2;
        }
        return j;
    }

    private static boolean o(Context context)
    {
        boolean flag = false;
        if (iX)
        {
            flag = iZ;
        } else
        {
            try
            {
                context = a(context.getPackageManager().getPackageInfo("com.google.android.apps.bazaar", 64), iW);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            if (context != null)
            {
                return true;
            }
        }
        return flag;
    }

    private static byte[] t(String s)
    {
        try
        {
            s = s.getBytes("ISO-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

}

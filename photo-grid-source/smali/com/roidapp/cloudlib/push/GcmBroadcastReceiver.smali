.class public Lcom/roidapp/cloudlib/push/GcmBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field public static a:I

.field public static b:I

.field public static c:Ljava/lang/String;

.field private static d:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    const/16 v0, 0xea5

    sput v0, Lcom/roidapp/cloudlib/push/GcmBroadcastReceiver;->a:I

    .line 20
    const/16 v0, 0xea4

    sput v0, Lcom/roidapp/cloudlib/push/GcmBroadcastReceiver;->b:I

    .line 21
    const-string v0, "GP_GCM"

    sput-object v0, Lcom/roidapp/cloudlib/push/GcmBroadcastReceiver;->c:Ljava/lang/String;

    .line 23
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/push/GcmBroadcastReceiver;->d:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 12

    .prologue
    const/4 v1, 0x0

    const/high16 v7, 0x10000000

    const/high16 v6, 0x4000000

    const v5, 0x8000

    const/16 v4, 0xb

    .line 27
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 1158
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 30
    :cond_1
    const-string v0, "com.roidapp.photogrid.notification"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 31
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 1053
    if-eqz p1, :cond_0

    if-eqz v2, :cond_0

    .line 1056
    const-string v0, "pushid"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1057
    if-eqz v0, :cond_2

    .line 1058
    const-string v3, "open"

    invoke-static {v3, v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1062
    :cond_2
    const-string v0, "pushType"

    const/4 v3, -0x1

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 1063
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1067
    :pswitch_1
    const-string v0, "version"

    const/4 v3, -0x1

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 1068
    invoke-static {p1}, Lcom/roidapp/baselib/c/n;->c(Landroid/content/Context;)I

    move-result v2

    if-ge v2, v0, :cond_0

    .line 1075
    const/4 v0, 0x0

    const-string v2, "market://details?id=com.roidapp.photogrid"

    const-string v3, "http://dl.cm.ksmobile.com/photogrid/photoGrid.apk"

    invoke-static {p1, v0, v2, v3, v1}, Lcom/roidapp/cloudlib/ads/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 1081
    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/al;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v0, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1082
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v3, v4, :cond_3

    .line 1083
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1085
    :goto_1
    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1086
    const-string v3, "gcm_page"

    const-string v4, "page"

    invoke-virtual {v2, v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1087
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 1084
    :cond_3
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_1

    .line 1097
    :pswitch_3
    const-string v0, "package"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1098
    const-string v1, "url"

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1099
    const-string v3, "playUrl"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1100
    const/4 v3, 0x1

    invoke-static {p1, v0, v2, v1, v3}, Lcom/roidapp/cloudlib/ads/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 1105
    :pswitch_4
    const-string v0, "url"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roidapp/cloudlib/ads/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1123
    :pswitch_5
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1124
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v4, :cond_4

    .line 1125
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1127
    :goto_2
    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1128
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 1126
    :cond_4
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_2

    .line 1134
    :pswitch_6
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1135
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v4, :cond_5

    .line 1136
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1138
    :goto_3
    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1139
    const-string v1, "gcm_page"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1140
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 1137
    :cond_5
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_3

    .line 1146
    :pswitch_7
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/cloudlib/ads/PushAdActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1147
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v4, :cond_6

    .line 1148
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1150
    :goto_4
    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1151
    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1152
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 1149
    :cond_6
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_4

    .line 2168
    :pswitch_8
    if-eqz v2, :cond_0

    .line 2173
    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 2174
    if-eqz v0, :cond_7

    .line 2175
    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    .line 2187
    :cond_7
    const-string v0, "snsPid"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 2189
    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/al;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2194
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v2, v4, :cond_8

    .line 2195
    invoke-virtual {v1, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 2198
    :goto_5
    invoke-virtual {v1, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 2199
    const-string v2, "snsPush"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2200
    const-string v2, "snsPid"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2201
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 2196
    :cond_8
    invoke-virtual {v1, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_5

    .line 1163
    :pswitch_9
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/al;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1164
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v4, :cond_9

    .line 1165
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1167
    :goto_6
    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1168
    const-string v1, "gcm_page"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1169
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 1166
    :cond_9
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_6

    .line 33
    :cond_a
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 34
    invoke-static {p1}, Lcom/google/android/gms/gcm/a;->a(Landroid/content/Context;)Lcom/google/android/gms/gcm/a;

    .line 35
    invoke-static {p2}, Lcom/google/android/gms/gcm/a;->a(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v2

    .line 37
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/Bundle;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "gcm"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 38
    const-string v3, "gcm"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 40
    const-string v2, "msg"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-static {p1, v0}, Lcom/roidapp/cloudlib/push/e;->a(Landroid/content/Context;Ljava/lang/String;)[Lcom/roidapp/cloudlib/push/f;

    move-result-object v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    array-length v4, v3

    move v2, v1

    :goto_7
    if-ge v2, v4, :cond_0

    aget-object v5, v3, v2

    .line 46
    if-eqz v5, :cond_d

    iget-object v0, v5, Lcom/roidapp/cloudlib/push/f;->g:Landroid/os/Bundle;

    if-eqz v0, :cond_d

    iget-object v0, v5, Lcom/roidapp/cloudlib/push/f;->d:Ljava/lang/String;

    if-eqz v0, :cond_d

    iget-object v0, v5, Lcom/roidapp/cloudlib/push/f;->e:Ljava/lang/String;

    if-nez v0, :cond_b

    iget-object v0, v5, Lcom/roidapp/cloudlib/push/f;->f:Ljava/lang/String;

    if-eqz v0, :cond_d

    .line 48
    :cond_b
    sget-object v0, Lcom/roidapp/cloudlib/push/GcmBroadcastReceiver;->d:Ljava/util/HashSet;

    iget-object v1, v5, Lcom/roidapp/cloudlib/push/f;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 49
    iget-boolean v0, v5, Lcom/roidapp/cloudlib/push/f;->i:Z

    if-eqz v0, :cond_c

    .line 51
    const-string v0, "show"

    iget-object v1, v5, Lcom/roidapp/cloudlib/push/f;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 3065
    :cond_c
    if-eqz v5, :cond_d

    iget-object v0, v5, Lcom/roidapp/cloudlib/push/f;->g:Landroid/os/Bundle;

    if-nez v0, :cond_e

    .line 45
    :cond_d
    :goto_8
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_7

    .line 3067
    :cond_e
    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 3068
    if-eqz v0, :cond_d

    .line 3072
    new-instance v6, Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-direct {v6, p1}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x15

    if-lt v1, v7, :cond_10

    sget v1, Lcom/roidapp/cloudlib/aq;->Q:I

    :goto_9
    invoke-virtual {v6, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    iget-object v6, v5, Lcom/roidapp/cloudlib/push/f;->e:Ljava/lang/String;

    invoke-virtual {v1, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    const/4 v6, 0x1

    invoke-virtual {v1, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    new-instance v6, Landroid/support/v4/app/NotificationCompat$BigTextStyle;

    invoke-direct {v6}, Landroid/support/v4/app/NotificationCompat$BigTextStyle;-><init>()V

    iget-object v7, v5, Lcom/roidapp/cloudlib/push/f;->f:Ljava/lang/String;

    invoke-virtual {v6, v7}, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigTextStyle;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setStyle(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    iget-object v6, v5, Lcom/roidapp/cloudlib/push/f;->f:Ljava/lang/String;

    invoke-virtual {v1, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    iget v6, v5, Lcom/roidapp/cloudlib/push/f;->a:I

    invoke-virtual {v1, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    .line 3080
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x15

    if-lt v6, v7, :cond_f

    .line 3081
    iget-object v6, v5, Lcom/roidapp/cloudlib/push/f;->h:Landroid/graphics/Bitmap;

    if-eqz v6, :cond_11

    iget-object v6, v5, Lcom/roidapp/cloudlib/push/f;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v6

    if-nez v6, :cond_11

    .line 3082
    iget-object v6, v5, Lcom/roidapp/cloudlib/push/f;->h:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 3085
    :goto_a
    const v6, -0xff3400

    invoke-virtual {v1, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setColor(I)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 3088
    :cond_f
    new-instance v6, Landroid/content/Intent;

    const-string v7, "com.roidapp.photogrid.notification"

    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 3089
    iget-object v7, v5, Lcom/roidapp/cloudlib/push/f;->g:Landroid/os/Bundle;

    invoke-virtual {v6, v7}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 3090
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v8

    const-wide v10, 0x40c3880000000000L    # 10000.0

    mul-double/2addr v8, v10

    double-to-int v7, v8

    const/high16 v8, 0x40000000    # 2.0f

    invoke-static {p1, v7, v6, v8}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 3091
    invoke-virtual {v1, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 3093
    :try_start_0
    iget-object v6, v5, Lcom/roidapp/cloudlib/push/f;->c:Ljava/lang/String;

    iget v5, v5, Lcom/roidapp/cloudlib/push/f;->b:I

    invoke-virtual {v1}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {v0, v6, v5, v1}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    goto/16 :goto_8

    .line 3072
    :cond_10
    sget v1, Lcom/roidapp/cloudlib/aq;->R:I

    goto :goto_9

    .line 3084
    :cond_11
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lcom/roidapp/cloudlib/aq;->R:I

    invoke-static {v6, v7}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;

    goto :goto_a

    .line 1063
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

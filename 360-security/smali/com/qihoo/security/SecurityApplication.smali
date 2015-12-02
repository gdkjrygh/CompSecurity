.class public Lcom/qihoo/security/SecurityApplication;
.super Landroid/app/Application;
.source "360Security"

# interfaces
.implements Landroid/os/MessageQueue$IdleHandler;


# static fields
.field public static a:Z

.field public static b:J

.field public static c:Z

.field static final d:[I

.field static final e:[I

.field static final f:[I

.field static final g:[I

.field static final h:[I

.field private static final j:Ljava/lang/String;

.field private static k:Landroid/content/Context;

.field private static l:Z

.field private static m:Ljava/lang/String;

.field private static n:Landroid/os/Looper;


# instance fields
.field i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 40
    const-class v0, Lcom/qihoo/security/SecurityApplication;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/SecurityApplication;->j:Ljava/lang/String;

    .line 43
    sput-boolean v2, Lcom/qihoo/security/SecurityApplication;->l:Z

    .line 45
    sput-boolean v2, Lcom/qihoo/security/SecurityApplication;->a:Z

    .line 47
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/qihoo/security/SecurityApplication;->b:J

    .line 48
    sput-boolean v2, Lcom/qihoo/security/SecurityApplication;->c:Z

    .line 221
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/qihoo/security/SecurityApplication;->d:[I

    .line 229
    const/16 v0, 0x11

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/qihoo/security/SecurityApplication;->e:[I

    .line 249
    const/16 v0, 0xc

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lcom/qihoo/security/SecurityApplication;->f:[I

    .line 264
    const/16 v0, 0xd

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lcom/qihoo/security/SecurityApplication;->g:[I

    .line 280
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    sput-object v0, Lcom/qihoo/security/SecurityApplication;->h:[I

    return-void

    .line 221
    nop

    :array_0
    .array-data 4
        0x7f0b0126
        0x7f0b012a
        0x7f0b012b
        0x7f0b0129
        0x7f0b012c
        0x7f0b012d
    .end array-data

    .line 229
    :array_1
    .array-data 4
        0x7f0b00bd
        0x7f0b00be
        0x7f0b00bf
        0x7f0b00c0
        0x7f0b00b3
        0x7f0b00b4
        0x7f0b00b5
        0x7f0b00b6
        0x7f0b00c3
        0x7f0b00c5
        0x7f0b00c6
        0x7f0b00c7
        0x7f0b00b8
        0x7f0b00b9
        0x7f0b00ba
        0x7f0b00b1
        0x7f0b00bc
    .end array-data

    .line 249
    :array_2
    .array-data 4
        0x7f0b022f
        0x7f0b0231
        0x7f0b0233
        0x7f0b0234
        0x7f0b0237
        0x7f0b0230
        0x7f0b0235
        0x7f0b023a
        0x7f0b023c
        0x7f0b0240
        0x7f0b0244
        0x7f0b0239
    .end array-data

    .line 264
    :array_3
    .array-data 4
        0x7f0b009d
        0x7f0b009f
        0x7f0b00a0
        0x7f0b00a2
        0x7f0b00a6
        0x7f0b00a3
        0x7f0b01c8
        0x7f0b01c9
        0x7f0b0194
        0x7f0b0195
        0x7f0b00a5
        0x7f0b00a7
        0x7f0b00f6
    .end array-data

    .line 280
    :array_4
    .array-data 4
        0x7f0b0071
        0x7f0b006b
        0x7f0b0070
        0x7f0b006c
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 312
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/SecurityApplication;->i:Z

    return-void
.end method

.method public static a()Landroid/content/Context;
    .locals 1

    .prologue
    .line 206
    sget-object v0, Lcom/qihoo/security/SecurityApplication;->k:Landroid/content/Context;

    return-object v0
.end method

.method public static a(Z)V
    .locals 0

    .prologue
    .line 210
    sput-boolean p0, Lcom/qihoo/security/SecurityApplication;->l:Z

    .line 211
    return-void
.end method

.method public static b()Z
    .locals 1

    .prologue
    .line 214
    sget-boolean v0, Lcom/qihoo/security/SecurityApplication;->l:Z

    return v0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 218
    sget-object v0, Lcom/qihoo/security/SecurityApplication;->m:Ljava/lang/String;

    return-object v0
.end method

.method public static e()Landroid/os/Looper;
    .locals 1

    .prologue
    .line 364
    sget-object v0, Lcom/qihoo/security/SecurityApplication;->n:Landroid/os/Looper;

    return-object v0
.end method

.method private f()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 289
    iput-boolean v5, p0, Lcom/qihoo/security/SecurityApplication;->i:Z

    .line 290
    const/4 v0, -0x4

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 291
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v2

    .line 292
    const v3, 0x7f030093

    move-object v0, v1

    check-cast v0, [I

    invoke-virtual {v2, v3, v0, v4}, Lcom/qihoo/security/ui/b/a;->a(I[IZ)V

    .line 293
    const v0, 0x7f03001d

    sget-object v3, Lcom/qihoo/security/SecurityApplication;->h:[I

    invoke-virtual {v2, v0, v3, v4}, Lcom/qihoo/security/ui/b/a;->a(I[IZ)V

    .line 294
    const v3, 0x7f03009f

    move-object v0, v1

    check-cast v0, [I

    invoke-virtual {v2, v3, v0, v4}, Lcom/qihoo/security/ui/b/a;->a(I[IZ)V

    .line 295
    const v0, 0x7f030055

    sget-object v3, Lcom/qihoo/security/SecurityApplication;->d:[I

    invoke-virtual {v2, v0, v3, v4}, Lcom/qihoo/security/ui/b/a;->a(I[IZ)V

    .line 296
    const v0, 0x7f03008c

    check-cast v1, [I

    invoke-virtual {v2, v0, v1, v4}, Lcom/qihoo/security/ui/b/a;->a(I[IZ)V

    .line 297
    const v0, 0x7f030033

    sget-object v1, Lcom/qihoo/security/SecurityApplication;->e:[I

    invoke-virtual {v2, v0, v1, v4}, Lcom/qihoo/security/ui/b/a;->a(I[IZ)V

    .line 298
    const v0, 0x7f0300ae

    sget-object v1, Lcom/qihoo/security/SecurityApplication;->f:[I

    invoke-virtual {v2, v0, v1, v4}, Lcom/qihoo/security/ui/b/a;->a(I[IZ)V

    .line 299
    const v0, 0x7f030030

    sget-object v1, Lcom/qihoo/security/SecurityApplication;->g:[I

    invoke-virtual {v2, v0, v1, v4}, Lcom/qihoo/security/ui/b/a;->a(I[IZ)V

    .line 301
    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v2, v0}, Lcom/qihoo/security/ui/b/a;->a([I)V

    .line 309
    invoke-static {p0}, Lcom/qihoo/security/app/a;->a(Landroid/content/Context;)Lcom/qihoo/security/app/a;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/qihoo/security/app/a;->a(Z)V

    .line 310
    return-void

    .line 301
    nop

    :array_0
    .array-data 4
        0x7f02004e
        0x7f02009a
        0x7f020152
        0x7f02004c
        0x7f02004d
        0x7f02009b
        0x7f020099
        0x7f02009c
    .end array-data
.end method

.method private g()V
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 317
    const-string/jumbo v2, "init_done"

    invoke-static {p0, v2, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    .line 318
    if-nez v2, :cond_0

    .line 322
    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 323
    const-string/jumbo v3, "init_done"

    invoke-static {p0, v3, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 325
    const-string/jumbo v3, "fv_enabled"

    const v4, 0x7f070009

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v4

    if-eqz v4, :cond_1

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x15

    if-ge v4, v5, :cond_1

    :goto_0
    invoke-static {p0, v3, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 328
    const-string/jumbo v0, "notification"

    const v1, 0x7f070006

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 330
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 325
    goto :goto_0
.end method


# virtual methods
.method final d()V
    .locals 1

    .prologue
    .line 341
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    .line 342
    invoke-virtual {v0, p0}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 343
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 333
    iget-boolean v0, p0, Lcom/qihoo/security/SecurityApplication;->i:Z

    if-eqz v0, :cond_0

    .line 334
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    .line 335
    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/b/a;->a(Landroid/content/res/Configuration;)V

    .line 337
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Application;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 338
    return-void
.end method

.method public onCreate()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 53
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/o;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/SecurityApplication;->m:Ljava/lang/String;

    .line 63
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 65
    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/SecurityApplication;->k:Landroid/content/Context;

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    invoke-static {}, Lcom/qihoo/security/support/b;->c()V

    .line 73
    const-string/jumbo v0, ""

    .line 74
    sget-object v1, Lcom/qihoo/security/SecurityApplication;->k:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/security/clearengine/b/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 109
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    .line 111
    sget-object v0, Lcom/qihoo/security/SecurityApplication;->m:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ":crashhandler"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 114
    invoke-static {p0}, Lcom/qihoo/security/crashhandler/b;->a(Landroid/content/Context;)Lcom/qihoo/security/crashhandler/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/crashhandler/b;->a()V

    .line 118
    :cond_0
    sget-object v0, Lcom/qihoo/security/SecurityApplication;->m:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 124
    invoke-direct {p0}, Lcom/qihoo/security/SecurityApplication;->g()V

    .line 125
    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->d()V

    .line 126
    invoke-static {p0}, Lcom/qihoo/security/app/DaemonMain;->b(Landroid/content/Context;)V

    .line 129
    :try_start_0
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/NativeManager;->a(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    .line 137
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/b;->j()V

    .line 170
    :cond_1
    :goto_0
    sput-boolean v3, Lcom/qihoo/security/SecurityApplication;->a:Z

    .line 171
    invoke-static {}, Lcom/qihoo/security/profile/j;->a()Lcom/qihoo/security/profile/j;

    .line 182
    :try_start_1
    invoke-static {p0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 183
    const-class v1, Landroid/view/ViewConfiguration;

    const-string/jumbo v2, "sHasPermanentMenuKey"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 184
    if-eqz v1, :cond_2

    .line 185
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 186
    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 192
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich_last"

    invoke-static {v0, v1, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 193
    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich_last_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 195
    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "remind_trash_swtich_last"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 197
    :cond_3
    :goto_2
    return-void

    .line 138
    :cond_4
    sget-object v0, Lcom/qihoo/security/SecurityApplication;->m:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ":ui"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 142
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "AsyncLooperThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 143
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 144
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/SecurityApplication;->n:Landroid/os/Looper;

    .line 145
    invoke-direct {p0}, Lcom/qihoo/security/SecurityApplication;->f()V

    .line 146
    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->d()V

    .line 149
    :try_start_2
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/support/NativeManager;->a(Landroid/content/Context;)V
    :try_end_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 150
    :catch_0
    move-exception v0

    goto :goto_0

    .line 130
    :catch_1
    move-exception v0

    goto :goto_2

    .line 188
    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public onTerminate()V
    .locals 0

    .prologue
    .line 203
    return-void
.end method

.method public queueIdle()Z
    .locals 3

    .prologue
    .line 347
    sget-object v0, Lcom/qihoo/security/SecurityApplication;->m:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/qihoo/security/SecurityApplication;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 349
    sget-object v0, Lcom/qihoo/security/SecurityApplication;->k:Landroid/content/Context;

    sget-object v1, Lcom/qihoo/security/SecurityApplication;->k:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/support/c;->a(Landroid/content/Context;)Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo/b/a/d;->a(Landroid/content/Context;Landroid/os/Bundle;Lcom/qihoo/b/a/b;)V

    .line 355
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 353
    :cond_0
    invoke-static {p0}, Lcom/qihoo/security/adv/a/c;->a(Landroid/content/Context;)V

    goto :goto_0
.end method

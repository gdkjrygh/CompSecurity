.class public final Lcrittercism/android/az;
.super Ljava/lang/Object;

# interfaces
.implements Lcrittercism/android/au;
.implements Lcrittercism/android/aw;
.implements Lcrittercism/android/ax;
.implements Lcrittercism/android/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcrittercism/android/az$4;,
        Lcrittercism/android/az$a;
    }
.end annotation


# static fields
.field static a:Lcrittercism/android/az;


# instance fields
.field public A:Ljava/util/Map;

.field public B:Lcrittercism/android/dt;

.field C:I

.field private D:Ljava/lang/String;

.field private E:Lcrittercism/android/br;

.field private F:Lcrittercism/android/g;

.field private G:Lcrittercism/android/at;

.field private H:Z

.field private I:Ljava/lang/String;

.field public b:Z

.field public c:Landroid/content/Context;

.field public final d:Landroid/os/ConditionVariable;

.field public final e:Landroid/os/ConditionVariable;

.field public f:Lcrittercism/android/dw;

.field g:Lcrittercism/android/br;

.field h:Lcrittercism/android/br;

.field i:Lcrittercism/android/br;

.field j:Lcrittercism/android/br;

.field k:Lcrittercism/android/br;

.field l:Lcrittercism/android/br;

.field m:Lcrittercism/android/br;

.field n:Lcrittercism/android/br;

.field o:Lcrittercism/android/br;

.field p:Lcrittercism/android/br;

.field q:Lcrittercism/android/cv;

.field public r:Lcrittercism/android/dg;

.field s:Ljava/util/concurrent/ExecutorService;

.field public t:Ljava/util/concurrent/ExecutorService;

.field public u:Z

.field public v:Lcrittercism/android/bb;

.field protected w:Lcrittercism/android/e;

.field public x:Lcrittercism/android/dr;

.field y:Lcrittercism/android/dv;

.field public z:Lcrittercism/android/bi;


# direct methods
.method protected constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-boolean v2, p0, Lcrittercism/android/az;->b:Z

    .line 93
    iput-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    .line 94
    iput-object v1, p0, Lcrittercism/android/az;->D:Ljava/lang/String;

    .line 97
    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0, v2}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object v0, p0, Lcrittercism/android/az;->d:Landroid/os/ConditionVariable;

    .line 100
    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0, v2}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object v0, p0, Lcrittercism/android/az;->e:Landroid/os/ConditionVariable;

    .line 102
    new-instance v0, Lcrittercism/android/dw;

    invoke-direct {v0}, Lcrittercism/android/dw;-><init>()V

    iput-object v0, p0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    .line 115
    iput-object v1, p0, Lcrittercism/android/az;->q:Lcrittercism/android/cv;

    .line 117
    iput-object v1, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    .line 118
    iput-object v1, p0, Lcrittercism/android/az;->F:Lcrittercism/android/g;

    .line 121
    new-instance v0, Lcrittercism/android/dz;

    invoke-direct {v0}, Lcrittercism/android/dz;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/az;->s:Ljava/util/concurrent/ExecutorService;

    .line 124
    new-instance v0, Lcrittercism/android/dz;

    invoke-direct {v0}, Lcrittercism/android/dz;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    .line 128
    iput-boolean v2, p0, Lcrittercism/android/az;->H:Z

    .line 129
    iput-boolean v2, p0, Lcrittercism/android/az;->u:Z

    .line 131
    const-string v0, ""

    iput-object v0, p0, Lcrittercism/android/az;->I:Ljava/lang/String;

    .line 133
    new-instance v0, Lcrittercism/android/bb;

    invoke-direct {v0}, Lcrittercism/android/bb;-><init>()V

    iput-object v0, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    .line 139
    iput-object v1, p0, Lcrittercism/android/az;->y:Lcrittercism/android/dv;

    .line 142
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcrittercism/android/az;->A:Ljava/util/Map;

    .line 143
    iput-object v1, p0, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    .line 149
    iput v2, p0, Lcrittercism/android/az;->C:I

    .line 153
    new-instance v0, Lcrittercism/android/e;

    iget-object v1, p0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    invoke-direct {v0, v1}, Lcrittercism/android/e;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lcrittercism/android/az;->w:Lcrittercism/android/e;

    .line 154
    return-void
.end method

.method public static A()Lcrittercism/android/az;
    .locals 1

    .prologue
    .line 157
    sget-object v0, Lcrittercism/android/az;->a:Lcrittercism/android/az;

    if-nez v0, :cond_0

    .line 158
    new-instance v0, Lcrittercism/android/az;

    invoke-direct {v0}, Lcrittercism/android/az;-><init>()V

    sput-object v0, Lcrittercism/android/az;->a:Lcrittercism/android/az;

    .line 161
    :cond_0
    sget-object v0, Lcrittercism/android/az;->a:Lcrittercism/android/az;

    return-object v0
.end method

.method private static F()Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 224
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    move v0, v1

    .line 226
    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_1

    .line 227
    aget-object v3, v2, v0

    .line 228
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "onCreate"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "onResume"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 230
    :cond_0
    const/4 v1, 0x1

    .line 233
    :cond_1
    return v1

    .line 226
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private G()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v3, 0x0

    .line 289
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v4

    .line 290
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v5

    .line 293
    iget-object v0, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 295
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v1

    .line 298
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v3

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 299
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->uid:I

    if-ne v1, v4, :cond_4

    .line 300
    add-int/lit8 v1, v2, 0x1

    :goto_1
    move v2, v1

    .line 302
    goto :goto_0

    .line 304
    :cond_0
    if-gt v2, v7, :cond_2

    .line 305
    iput-boolean v3, p0, Lcrittercism/android/az;->u:Z

    .line 320
    :cond_1
    :goto_2
    return-void

    .line 309
    :cond_2
    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getRunningServices(I)Ljava/util/List;

    move-result-object v0

    .line 314
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningServiceInfo;

    .line 315
    iget v0, v0, Landroid/app/ActivityManager$RunningServiceInfo;->pid:I

    if-ne v0, v5, :cond_3

    .line 316
    iput-boolean v7, p0, Lcrittercism/android/az;->u:Z

    goto :goto_2

    :cond_4
    move v1, v2

    goto :goto_1
.end method

.method private H()Ljava/lang/String;
    .locals 2

    .prologue
    .line 540
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/az;->I:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcrittercism/android/az;->I:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 541
    :cond_0
    iget-object v0, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/az;->I:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 548
    :cond_1
    :goto_0
    iget-object v0, p0, Lcrittercism/android/az;->I:Ljava/lang/String;

    return-object v0

    .line 545
    :catch_0
    move-exception v0

    const-string v0, "CrittercismInstance"

    const-string v1, "Call to getPackageName() failed.  Please contact us at support@crittercism.com."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    iput-object v0, p0, Lcrittercism/android/az;->I:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public final B()Z
    .locals 1

    .prologue
    .line 1127
    iget-object v0, p0, Lcrittercism/android/az;->d:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    .line 1128
    iget-object v0, p0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v0}, Lcrittercism/android/dw;->b()Z

    move-result v0

    return v0
.end method

.method public final C()V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .prologue
    .line 1151
    iget-object v0, p0, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    .line 1153
    iget-object v0, p0, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    if-eqz v0, :cond_0

    .line 1154
    iget-object v0, p0, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    invoke-virtual {v0}, Lcrittercism/android/dt;->d()V

    .line 1156
    :cond_0
    return-void
.end method

.method public final D()Ljava/lang/String;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .prologue
    .line 1189
    iget-object v0, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 1190
    invoke-direct {p0}, Lcrittercism/android/az;->H()Ljava/lang/String;

    move-result-object v2

    .line 1191
    const/4 v0, 0x0

    .line 1192
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 1193
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1194
    invoke-static {v0}, Lcrittercism/android/dp;->a(Ljava/lang/String;)Lcrittercism/android/dn;

    move-result-object v0

    .line 1195
    if-eqz v0, :cond_1

    .line 1196
    invoke-interface {v0, v2}, Lcrittercism/android/dn;->a(Ljava/lang/String;)Lcrittercism/android/dm;

    move-result-object v0

    invoke-virtual {v0}, Lcrittercism/android/dm;->a()Ljava/lang/String;

    move-result-object v0

    .line 1202
    :cond_0
    :goto_0
    return-object v0

    .line 1198
    :cond_1
    const-string v0, "Crittercism"

    const-string v1, "Could not find app market for this app.  Will try rate-my-app test target in config."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1199
    iget-object v0, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v0}, Lcrittercism/android/bb;->getRateMyAppTestTarget()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final E()V
    .locals 2

    .prologue
    .line 1355
    iget-boolean v0, p0, Lcrittercism/android/az;->u:Z

    if-eqz v0, :cond_1

    .line 1384
    :cond_0
    :goto_0
    return-void

    .line 1361
    :cond_1
    new-instance v0, Lcrittercism/android/az$3;

    invoke-direct {v0, p0, p0}, Lcrittercism/android/az$3;-><init>(Lcrittercism/android/az;Lcrittercism/android/az;)V

    .line 1381
    iget-object v1, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v1, v0}, Lcrittercism/android/dg;->a(Ljava/lang/Runnable;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1382
    iget-object v1, p0, Lcrittercism/android/az;->s:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog;
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1261
    iget-object v2, p0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v2}, Lcrittercism/android/dw;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "CrittercismInstance"

    const-string v3, "User has opted out of crittercism.  generateRateMyAppAlertDialog returning null."

    invoke-static {v2, v3}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-nez v1, :cond_5

    .line 1312
    :goto_1
    return-object v0

    .line 1261
    :cond_0
    instance-of v2, p1, Landroid/app/Activity;

    if-nez v2, :cond_1

    const-string v2, "CrittercismInstance"

    const-string v3, "Context object must be an instance of Activity for AlertDialog to form correctly.  generateRateMyAppAlertDialog returning null."

    invoke-static {v2, v3}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    const-string v2, "CrittercismInstance"

    const-string v3, "Message has to be a non-empty string.  generateRateMyAppAlertDialog returning null."

    invoke-static {v2, v3}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v3, 0x5

    if-ge v2, v3, :cond_4

    const-string v2, "Crittercism"

    const-string v3, "Rate my app not supported below api level 5"

    invoke-static {v2, v3}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    const/4 v1, 0x1

    goto :goto_0

    .line 1265
    :cond_5
    invoke-virtual {p0}, Lcrittercism/android/az;->D()Ljava/lang/String;

    move-result-object v1

    .line 1266
    if-nez v1, :cond_6

    .line 1267
    const-string v1, "Crittercism"

    const-string v2, "Cannot create proper URI to open app market.  Returning null."

    invoke-static {v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 1271
    :cond_6
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1272
    invoke-virtual {v2, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    invoke-virtual {v3, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1275
    :try_start_0
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1283
    const/4 v2, -0x1

    const-string v3, "Yes"

    new-instance v4, Lcrittercism/android/az$10;

    invoke-direct {v4, p0, v1}, Lcrittercism/android/az$10;-><init>(Lcrittercism/android/az;Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3, v4}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 1293
    const/4 v1, -0x2

    const-string v2, "No"

    new-instance v3, Lcrittercism/android/az$11;

    invoke-direct {v3, p0}, Lcrittercism/android/az$11;-><init>(Lcrittercism/android/az;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 1303
    const/4 v1, -0x3

    const-string v2, "Maybe Later"

    new-instance v3, Lcrittercism/android/az$12;

    invoke-direct {v3, p0}, Lcrittercism/android/az$12;-><init>(Lcrittercism/android/az;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/AlertDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_1

    .line 1279
    :catch_0
    move-exception v1

    const-string v1, "Crittercism"

    const-string v2, "Failed to create AlertDialog instance from AlertDialog.Builder.  Did you remember to call Looper.prepare() before calling Crittercism.generateRateMyAppAlertDialog()?"

    invoke-static {v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 775
    iget-object v0, p0, Lcrittercism/android/az;->D:Ljava/lang/String;

    .line 777
    if-nez v0, :cond_0

    .line 778
    const-string v0, ""

    .line 781
    :cond_0
    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 952
    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 955
    if-eqz v1, :cond_0

    .line 956
    invoke-interface {v1, p2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 959
    :cond_0
    return-object v0
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/crittercism/app/CrittercismConfig;)V
    .locals 6

    .prologue
    .line 169
    const-string v0, "Crittercism"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Initializing Crittercism 5.0.4 for App ID "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcrittercism/android/dx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    iput-object p2, p0, Lcrittercism/android/az;->D:Ljava/lang/String;

    .line 172
    new-instance v0, Lcrittercism/android/bb;

    invoke-direct {v0, p3}, Lcrittercism/android/bb;-><init>(Lcom/crittercism/app/CrittercismConfig;)V

    iput-object v0, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    .line 173
    iput-object p1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    .line 174
    new-instance v0, Lcrittercism/android/at;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    iget-object v2, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/at;-><init>(Landroid/content/Context;Lcom/crittercism/app/CrittercismConfig;)V

    iput-object v0, p0, Lcrittercism/android/az;->G:Lcrittercism/android/at;

    .line 175
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/az;->I:Ljava/lang/String;

    .line 177
    new-instance v0, Lcrittercism/android/dr;

    invoke-direct {v0, p1}, Lcrittercism/android/dr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcrittercism/android/az;->x:Lcrittercism/android/dr;

    .line 178
    invoke-direct {p0}, Lcrittercism/android/az;->G()V

    .line 179
    const-wide v0, 0xdf8475800L

    .line 180
    iget-boolean v2, p0, Lcrittercism/android/az;->u:Z

    if-eqz v2, :cond_0

    .line 181
    const-wide v0, 0x2cb417800L

    .line 183
    :cond_0
    new-instance v2, Lcrittercism/android/cv;

    invoke-direct {v2, v0, v1}, Lcrittercism/android/cv;-><init>(J)V

    iput-object v2, p0, Lcrittercism/android/az;->q:Lcrittercism/android/cv;

    .line 186
    invoke-static {}, Lcrittercism/android/az;->F()Z

    move-result v0

    if-nez v0, :cond_1

    .line 187
    const-string v0, "CrittercismInstance"

    const-string v1, "Crittercism should be initialized in onCreate() of MainActivity"

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :cond_1
    iget-object v0, p0, Lcrittercism/android/az;->G:Lcrittercism/android/at;

    invoke-static {v0}, Lcrittercism/android/bw;->a(Lcrittercism/android/at;)V

    .line 192
    iget-object v0, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-static {v0}, Lcrittercism/android/bw;->a(Landroid/content/Context;)V

    .line 193
    new-instance v0, Lcrittercism/android/cb;

    invoke-direct {v0}, Lcrittercism/android/cb;-><init>()V

    invoke-static {v0}, Lcrittercism/android/bw;->a(Lcrittercism/android/ca;)V

    .line 194
    new-instance v0, Lcrittercism/android/bf;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    iget-object v2, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/bf;-><init>(Landroid/content/Context;Lcom/crittercism/app/CrittercismConfig;)V

    invoke-static {v0}, Lcrittercism/android/bw;->a(Lcrittercism/android/bf;)V

    .line 196
    iget-object v0, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-static {v0}, Lcrittercism/android/h;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v0}, Lcrittercism/android/bb;->isOptmzEnabled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 197
    :cond_2
    :goto_0
    new-instance v0, Lcrittercism/android/dg;

    iget-object v1, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    move-object v2, p1

    move-object v3, p0

    move-object v4, p0

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcrittercism/android/dg;-><init>(Lcrittercism/android/bb;Landroid/content/Context;Lcrittercism/android/aw;Lcrittercism/android/ax;Lcrittercism/android/au;)V

    iput-object v0, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    .line 198
    iget-boolean v0, p0, Lcrittercism/android/az;->u:Z

    if-nez v0, :cond_3

    .line 199
    new-instance v0, Lcrittercism/android/ec;

    iget-object v1, p0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    iget-object v3, p0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-direct {v0, p0, v1, v2, v3}, Lcrittercism/android/ec;-><init>(Lcrittercism/android/aw;Ljava/util/concurrent/ExecutorService;Lcrittercism/android/dg;Lcrittercism/android/dw;)V

    invoke-static {v0}, Lcrittercism/android/dx;->a(Lcrittercism/android/ec;)V

    .line 207
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    .line 208
    instance-of v1, v0, Lcrittercism/android/ay;

    if-nez v1, :cond_4

    .line 209
    new-instance v1, Lcrittercism/android/ay;

    invoke-direct {v1, p0, v0}, Lcrittercism/android/ay;-><init>(Lcrittercism/android/az;Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 211
    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 214
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_8

    iget-object v0, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Application;

    if-nez v0, :cond_7

    const-string v0, "CrittercismInstance"

    const-string v1, "Application context not provided. Automatic breadcrumbs will not be recorded."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    :goto_1
    iget-boolean v0, p0, Lcrittercism/android/az;->u:Z

    if-nez v0, :cond_5

    .line 216
    invoke-static {p0}, Lcrittercism/android/bg;->c(Lcrittercism/android/az;)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    new-instance v1, Lcrittercism/android/az$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcrittercism/android/az$a;-><init>(B)V

    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 219
    :cond_5
    new-instance v0, Lcrittercism/android/dy;

    iget-object v1, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-direct {v0, v1}, Lcrittercism/android/dy;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcrittercism/android/dy;->start()V

    .line 220
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcrittercism/android/az;->b:Z

    .line 221
    return-void

    .line 196
    :cond_6
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/az;->w:Lcrittercism/android/e;

    iget-object v1, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v1}, Lcrittercism/android/bb;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcrittercism/android/e;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcrittercism/android/az;->w:Lcrittercism/android/e;

    iget-object v1, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v1}, Lcrittercism/android/bb;->getPreserveQueryStringPatterns()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcrittercism/android/e;->b(Ljava/util/List;)V

    new-instance v0, Lcrittercism/android/d;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcrittercism/android/d;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcrittercism/android/i;

    iget-object v2, p0, Lcrittercism/android/az;->w:Lcrittercism/android/e;

    invoke-direct {v1, v2, v0}, Lcrittercism/android/i;-><init>(Lcrittercism/android/e;Lcrittercism/android/d;)V

    new-instance v0, Ljava/net/URL;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v3}, Lcrittercism/android/bb;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/api/apm/network"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcrittercism/android/g;

    invoke-direct {v2, p0, v0}, Lcrittercism/android/g;-><init>(Lcrittercism/android/au;Ljava/net/URL;)V

    iput-object v2, p0, Lcrittercism/android/az;->F:Lcrittercism/android/g;

    iget-object v0, p0, Lcrittercism/android/az;->w:Lcrittercism/android/e;

    iget-object v2, p0, Lcrittercism/android/az;->F:Lcrittercism/android/g;

    invoke-virtual {v0, v2}, Lcrittercism/android/e;->a(Lcrittercism/android/f;)V

    iget-object v0, p0, Lcrittercism/android/az;->w:Lcrittercism/android/e;

    invoke-virtual {v0, p0}, Lcrittercism/android/e;->a(Lcrittercism/android/f;)V

    new-instance v0, Lcrittercism/android/dy;

    iget-object v2, p0, Lcrittercism/android/az;->F:Lcrittercism/android/g;

    const-string v3, "OPTMZ"

    invoke-direct {v0, v2, v3}, Lcrittercism/android/dy;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    invoke-virtual {v1}, Lcrittercism/android/i;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcrittercism/android/az;->H:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "installedApm = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcrittercism/android/az;->H:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V

    goto/16 :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Exception in startApm: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcrittercism/android/dx;->b()V

    invoke-static {}, Lcrittercism/android/dx;->c()V

    goto :goto_2

    .line 214
    :cond_7
    invoke-static {}, Lcrittercism/android/dx;->b()V

    iget-object v0, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    check-cast v0, Landroid/app/Application;

    new-instance v1, Lcrittercism/android/av;

    iget-object v2, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-direct {v1, v2, p0}, Lcrittercism/android/av;-><init>(Landroid/content/Context;Lcrittercism/android/az;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    goto/16 :goto_1

    :cond_8
    const-string v0, "CrittercismInstance"

    const-string v1, "API Level is less than 14. Automatic breadcrumbs are not supported."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.method public final a(Lcrittercism/android/bh;)V
    .locals 3

    .prologue
    .line 976
    iget-object v0, p0, Lcrittercism/android/az;->z:Lcrittercism/android/bi;

    .line 977
    iget-object v0, p0, Lcrittercism/android/az;->z:Lcrittercism/android/bi;

    if-nez v0, :cond_1

    .line 988
    :cond_0
    :goto_0
    return-void

    .line 981
    :cond_1
    invoke-static {p1}, Lcrittercism/android/bg;->a(Lcrittercism/android/bh;)V

    .line 982
    invoke-static {}, Lcrittercism/android/bg;->i()V

    .line 984
    iget-boolean v0, p1, Lcrittercism/android/bh;->a:Z

    if-eqz v0, :cond_0

    .line 985
    iget-object v0, p0, Lcrittercism/android/az;->z:Lcrittercism/android/bi;

    iget v1, p1, Lcrittercism/android/bh;->b:I

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Lcrittercism/android/bi;->a(ILjava/util/concurrent/TimeUnit;)V

    .line 986
    iget-object v0, p0, Lcrittercism/android/az;->z:Lcrittercism/android/bi;

    invoke-virtual {v0}, Lcrittercism/android/bi;->b()V

    goto :goto_0
.end method

.method public final a(Lcrittercism/android/c;)V
    .locals 2

    .prologue
    .line 741
    new-instance v0, Lcrittercism/android/az$8;

    invoke-direct {v0, p0, p1}, Lcrittercism/android/az$8;-><init>(Lcrittercism/android/az;Lcrittercism/android/c;)V

    .line 747
    iget-object v1, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v1, v0}, Lcrittercism/android/dg;->a(Ljava/lang/Runnable;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 748
    iget-object v1, p0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 750
    :cond_0
    return-void
.end method

.method public final a(Lcrittercism/android/ch;)V
    .locals 2

    .prologue
    .line 753
    iget-object v0, p0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v0}, Lcrittercism/android/dw;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 767
    :cond_0
    :goto_0
    return-void

    .line 757
    :cond_1
    new-instance v0, Lcrittercism/android/az$9;

    invoke-direct {v0, p0, p1}, Lcrittercism/android/az$9;-><init>(Lcrittercism/android/az;Lcrittercism/android/ch;)V

    .line 764
    iget-object v1, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v1, v0}, Lcrittercism/android/dg;->a(Ljava/lang/Runnable;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 765
    iget-object v1, p0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final a(Lcrittercism/android/h;)V
    .locals 3

    .prologue
    .line 1009
    iget-boolean v0, p0, Lcrittercism/android/az;->H:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcrittercism/android/az;->v:Lcrittercism/android/bb;

    invoke-virtual {v0}, Lcrittercism/android/bb;->isOptmzEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1018
    :cond_0
    :goto_0
    return-void

    .line 1013
    :cond_1
    iget-boolean v0, p1, Lcrittercism/android/h;->a:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lcrittercism/android/h;->c:Z

    if-nez v0, :cond_0

    .line 1014
    const-string v0, "Crittercism"

    const-string v1, "Enabling OPTMZ"

    invoke-static {v0, v1}, Lcrittercism/android/dx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1015
    iget-object v0, p0, Lcrittercism/android/az;->F:Lcrittercism/android/g;

    iget v1, p1, Lcrittercism/android/h;->d:I

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Lcrittercism/android/g;->a(ILjava/util/concurrent/TimeUnit;)V

    .line 1016
    iget-object v0, p0, Lcrittercism/android/az;->F:Lcrittercism/android/g;

    invoke-virtual {v0}, Lcrittercism/android/g;->a()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .prologue
    .line 1137
    iget-object v0, p0, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    .line 1139
    iget-object v0, p0, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    if-eqz v0, :cond_0

    .line 1140
    iget-object v0, p0, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    invoke-virtual {v0}, Lcrittercism/android/dt;->d()V

    .line 1143
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1144
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1145
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1146
    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1147
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 1038
    iget-object v0, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1039
    if-eqz v0, :cond_0

    .line 1040
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1041
    if-eqz v0, :cond_0

    .line 1042
    invoke-interface {v0, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1043
    invoke-interface {v0, p2, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1044
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1047
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 963
    iget-object v0, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 965
    if-eqz v0, :cond_0

    .line 966
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 967
    if-eqz v0, :cond_0

    .line 968
    invoke-interface {v0, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 969
    invoke-interface {v0, p2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 970
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 973
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/net/URL;JJJILjava/lang/Exception;J)V
    .locals 6

    .prologue
    .line 435
    if-nez p1, :cond_0

    .line 437
    const-string v2, "Crittercism"

    const-string v3, "Null HTTP request method provided. Endpoint will not be logged."

    invoke-static {v2, v3}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    :goto_0
    return-void

    .line 441
    :cond_0
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 442
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 443
    const-string v4, "GET"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 444
    const-string v4, "POST"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 445
    const-string v4, "HEAD"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 446
    const-string v4, "PUT"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 447
    const-string v4, "DELETE"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 448
    const-string v4, "TRACE"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 449
    const-string v4, "OPTIONS"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 450
    const-string v4, "CONNECT"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 451
    const-string v4, "PATCH"

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 452
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 453
    const-string v3, "Crittercism"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Logging endpoint with invalid HTTP request method: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    :cond_1
    if-nez p2, :cond_2

    .line 460
    const-string v2, "Crittercism"

    const-string v3, "Null URL provided. Endpoint will not be logged"

    invoke-static {v2, v3}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 465
    :cond_2
    const-wide/16 v3, 0x0

    cmp-long v3, p5, v3

    if-ltz v3, :cond_3

    const-wide/16 v3, 0x0

    cmp-long v3, p7, v3

    if-gez v3, :cond_4

    .line 466
    :cond_3
    const-string v2, "Crittercism"

    const-string v3, "Invalid byte values. Bytes need to be non-negative. Endpoint will not be logged."

    invoke-static {v2, v3}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 471
    :cond_4
    if-eqz p9, :cond_7

    .line 472
    const/16 v3, 0x64

    if-lt p9, v3, :cond_5

    const/16 v3, 0x258

    if-lt p9, v3, :cond_6

    .line 473
    :cond_5
    const-string v3, "Crittercism"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Logging endpoint with invalid HTTP response code: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    :cond_6
    :goto_1
    new-instance v3, Lcrittercism/android/d;

    iget-object v4, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcrittercism/android/d;-><init>(Landroid/content/Context;)V

    .line 489
    invoke-virtual {v3}, Lcrittercism/android/d;->a()Lcrittercism/android/b;

    move-result-object v3

    .line 490
    const-wide/16 v4, 0x0

    cmp-long v4, p3, v4

    if-gez v4, :cond_8

    .line 497
    const-string v2, "Crittercism"

    const-string v3, "Invalid latency. Endpoint will not be logged."

    invoke-static {v2, v3}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 477
    :cond_7
    if-nez p10, :cond_6

    .line 478
    const-string v3, "Crittercism"

    const-string v4, "Logging endpoint with null error and response code of 0."

    invoke-static {v3, v4}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 504
    :cond_8
    const-wide/16 v4, 0x0

    cmp-long v4, p11, v4

    if-gez v4, :cond_9

    .line 505
    const-string v2, "Crittercism"

    const-string v3, "Invalid start time. Endpoint will not be logged."

    invoke-static {v2, v3}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 510
    :cond_9
    new-instance v4, Lcrittercism/android/c;

    invoke-direct {v4}, Lcrittercism/android/c;-><init>()V

    .line 511
    iput-object v2, v4, Lcrittercism/android/c;->f:Ljava/lang/String;

    .line 512
    invoke-virtual {p2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcrittercism/android/c;->a(Ljava/lang/String;)V

    .line 513
    invoke-virtual {v4, p5, p6}, Lcrittercism/android/c;->b(J)V

    .line 514
    invoke-virtual {v4, p7, p8}, Lcrittercism/android/c;->d(J)V

    .line 515
    iput p9, v4, Lcrittercism/android/c;->e:I

    .line 516
    iput-object v3, v4, Lcrittercism/android/c;->j:Lcrittercism/android/b;

    .line 517
    move-wide/from16 v0, p11

    invoke-virtual {v4, v0, v1}, Lcrittercism/android/c;->e(J)V

    .line 518
    add-long v2, p11, p3

    invoke-virtual {v4, v2, v3}, Lcrittercism/android/c;->f(J)V

    .line 520
    invoke-static {}, Lcrittercism/android/bc;->b()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 524
    invoke-static {}, Lcrittercism/android/bc;->a()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcrittercism/android/c;->a(Landroid/location/Location;)V

    .line 528
    :cond_a
    move-object/from16 v0, p10

    invoke-virtual {v4, v0}, Lcrittercism/android/c;->a(Ljava/lang/Throwable;)V

    .line 529
    iget-object v2, p0, Lcrittercism/android/az;->w:Lcrittercism/android/e;

    sget-object v3, Lcrittercism/android/c$a;->l:Lcrittercism/android/c$a;

    invoke-virtual {v2, v4, v3}, Lcrittercism/android/e;->a(Lcrittercism/android/c;Lcrittercism/android/c$a;)V

    goto/16 :goto_0
.end method

.method public final declared-synchronized a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 620
    monitor-enter p0

    if-nez p1, :cond_1

    .line 621
    :try_start_0
    const-string v0, "Crittercism"

    const-string v1, "Calling logHandledException with a null java.lang.Throwable. Nothing will be reported to Crittercism"

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 630
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 625
    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lcrittercism/android/az;->u:Z

    if-eqz v0, :cond_2

    .line 626
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    new-instance v2, Lcrittercism/android/az$5;

    invoke-direct {v2, p0, p1, v0, v1}, Lcrittercism/android/az$5;-><init>(Lcrittercism/android/az;Ljava/lang/Throwable;J)V

    iget-object v0, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v0, v2}, Lcrittercism/android/dg;->a(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 620
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 628
    :cond_2
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    new-instance v2, Lcrittercism/android/az$6;

    invoke-direct {v2, p0, p1, v0, v1}, Lcrittercism/android/az$6;-><init>(Lcrittercism/android/az;Ljava/lang/Throwable;J)V

    iget-object v0, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v0, v2}, Lcrittercism/android/dg;->a(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public final a(Lorg/json/JSONObject;)V
    .locals 2

    .prologue
    .line 1326
    iget-boolean v0, p0, Lcrittercism/android/az;->u:Z

    if-eqz v0, :cond_1

    .line 1352
    :cond_0
    :goto_0
    return-void

    .line 1332
    :cond_1
    new-instance v0, Lcrittercism/android/az$2;

    invoke-direct {v0, p0, p0, p1}, Lcrittercism/android/az$2;-><init>(Lcrittercism/android/az;Lcrittercism/android/az;Lorg/json/JSONObject;)V

    .line 1348
    iget-object v1, p0, Lcrittercism/android/az;->r:Lcrittercism/android/dg;

    invoke-virtual {v1, v0}, Lcrittercism/android/dg;->a(Ljava/lang/Runnable;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1349
    iget-object v1, p0, Lcrittercism/android/az;->t:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)I
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 1483
    .line 1485
    iget-boolean v0, p0, Lcrittercism/android/az;->u:Z

    if-eqz v0, :cond_0

    .line 1486
    const-string v0, "CrittercismInstance"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Transactions are not supported for services. Returning default value of -1 for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    .line 1498
    :goto_0
    return v0

    .line 1492
    :cond_0
    iget-object v2, p0, Lcrittercism/android/az;->A:Ljava/util/Map;

    monitor-enter v2

    .line 1493
    :try_start_0
    iget-object v0, p0, Lcrittercism/android/az;->A:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/crittercism/app/Transaction;

    .line 1494
    if-eqz v0, :cond_1

    .line 1495
    invoke-virtual {v0}, Lcom/crittercism/app/Transaction;->d()I

    move-result v0

    .line 1497
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1027
    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-virtual {v1, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 1030
    if-eqz v1, :cond_0

    .line 1031
    invoke-interface {v1, p2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 1034
    :cond_0
    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1092
    iget-object v0, p0, Lcrittercism/android/az;->G:Lcrittercism/android/at;

    iget-object v0, v0, Lcrittercism/android/at;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 787
    const-string v0, ""

    .line 789
    iget-object v1, p0, Lcrittercism/android/az;->x:Lcrittercism/android/dr;

    if-eqz v1, :cond_0

    .line 790
    iget-object v0, p0, Lcrittercism/android/az;->x:Lcrittercism/android/dr;

    invoke-virtual {v0}, Lcrittercism/android/dr;->a()Ljava/lang/String;

    move-result-object v0

    .line 793
    :cond_0
    return-object v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1050
    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-virtual {v1, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 1053
    if-eqz v1, :cond_0

    .line 1054
    invoke-interface {v1, p2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 1057
    :cond_0
    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1102
    const-string v0, "5.0.4"

    return-object v0
.end method

.method public final e()I
    .locals 2

    .prologue
    .line 822
    const/4 v0, -0x1

    .line 823
    iget-object v1, p0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    if-eqz v1, :cond_0

    .line 824
    iget-object v0, p0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    invoke-virtual {v0}, Lcrittercism/android/dw;->a()Lcrittercism/android/du;

    move-result-object v0

    iget v0, v0, Lcrittercism/android/du;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 826
    :cond_0
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 803
    new-instance v0, Lcrittercism/android/bw$f;

    invoke-direct {v0}, Lcrittercism/android/bw$f;-><init>()V

    iget-object v0, v0, Lcrittercism/android/bw$f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final g()I
    .locals 1

    .prologue
    .line 808
    new-instance v0, Lcrittercism/android/bw$o;

    invoke-direct {v0}, Lcrittercism/android/bw$o;-><init>()V

    iget-object v0, v0, Lcrittercism/android/bw$o;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public final h()I
    .locals 1

    .prologue
    .line 813
    new-instance v0, Lcrittercism/android/bw$p;

    invoke-direct {v0}, Lcrittercism/android/bw$p;-><init>()V

    iget-object v0, v0, Lcrittercism/android/bw$p;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1107
    const-string v0, "Android"

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1112
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1117
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Lcrittercism/android/dw;
    .locals 1

    .prologue
    .line 878
    iget-object v0, p0, Lcrittercism/android/az;->f:Lcrittercism/android/dw;

    return-object v0
.end method

.method public final m()Lcrittercism/android/dt;
    .locals 1

    .prologue
    .line 1542
    iget-object v0, p0, Lcrittercism/android/az;->B:Lcrittercism/android/dt;

    return-object v0
.end method

.method public final n()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 858
    iget-object v0, p0, Lcrittercism/android/az;->g:Lcrittercism/android/br;

    return-object v0
.end method

.method public final o()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 862
    iget-object v0, p0, Lcrittercism/android/az;->h:Lcrittercism/android/br;

    return-object v0
.end method

.method public final p()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 866
    iget-object v0, p0, Lcrittercism/android/az;->E:Lcrittercism/android/br;

    return-object v0
.end method

.method public final q()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 870
    iget-object v0, p0, Lcrittercism/android/az;->i:Lcrittercism/android/br;

    return-object v0
.end method

.method public final r()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 874
    iget-object v0, p0, Lcrittercism/android/az;->j:Lcrittercism/android/br;

    return-object v0
.end method

.method public final s()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 1073
    iget-object v0, p0, Lcrittercism/android/az;->k:Lcrittercism/android/br;

    return-object v0
.end method

.method public final t()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 1082
    iget-object v0, p0, Lcrittercism/android/az;->m:Lcrittercism/android/br;

    return-object v0
.end method

.method public final u()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 1078
    iget-object v0, p0, Lcrittercism/android/az;->l:Lcrittercism/android/br;

    return-object v0
.end method

.method public final v()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 1087
    iget-object v0, p0, Lcrittercism/android/az;->n:Lcrittercism/android/br;

    return-object v0
.end method

.method public final w()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 900
    iget-object v0, p0, Lcrittercism/android/az;->o:Lcrittercism/android/br;

    return-object v0
.end method

.method public final x()Lcrittercism/android/br;
    .locals 1

    .prologue
    .line 905
    iget-object v0, p0, Lcrittercism/android/az;->p:Lcrittercism/android/br;

    return-object v0
.end method

.method public final y()Lcrittercism/android/dv;
    .locals 1

    .prologue
    .line 1397
    iget-object v0, p0, Lcrittercism/android/az;->y:Lcrittercism/android/dv;

    return-object v0
.end method

.method public final z()V
    .locals 3

    .prologue
    .line 833
    iget-boolean v0, p0, Lcrittercism/android/az;->u:Z

    if-eqz v0, :cond_1

    .line 834
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->f:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcrittercism/android/br;->a(Landroid/content/Context;)Lcrittercism/android/br;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/az;->k:Lcrittercism/android/br;

    .line 841
    :goto_0
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->h:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->l:Lcrittercism/android/br;

    .line 842
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->g:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->m:Lcrittercism/android/br;

    .line 843
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->k:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->n:Lcrittercism/android/br;

    .line 845
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->a:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->g:Lcrittercism/android/br;

    .line 846
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->b:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->h:Lcrittercism/android/br;

    .line 847
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->c:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->E:Lcrittercism/android/br;

    .line 848
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->d:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->i:Lcrittercism/android/br;

    .line 849
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->e:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->j:Lcrittercism/android/br;

    .line 850
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->i:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->o:Lcrittercism/android/br;

    .line 851
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->j:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->p:Lcrittercism/android/br;

    .line 852
    iget-boolean v0, p0, Lcrittercism/android/az;->u:Z

    if-nez v0, :cond_0

    .line 853
    new-instance v0, Lcrittercism/android/dv;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    iget-object v2, p0, Lcrittercism/android/az;->D:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/dv;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcrittercism/android/az;->y:Lcrittercism/android/dv;

    .line 855
    :cond_0
    return-void

    .line 838
    :cond_1
    new-instance v0, Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/az;->c:Landroid/content/Context;

    sget-object v2, Lcrittercism/android/bq;->f:Lcrittercism/android/bq;

    invoke-direct {v0, v1, v2}, Lcrittercism/android/br;-><init>(Landroid/content/Context;Lcrittercism/android/bq;)V

    iput-object v0, p0, Lcrittercism/android/az;->k:Lcrittercism/android/br;

    goto/16 :goto_0
.end method

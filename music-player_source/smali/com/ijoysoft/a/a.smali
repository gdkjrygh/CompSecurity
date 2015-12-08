.class public final Lcom/ijoysoft/a/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/ijoysoft/a/a;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/google/android/gms/ads/AdView;

.field private f:Lcom/google/android/gms/ads/e;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Landroid/os/Handler;

.field private l:Landroid/app/Dialog;

.field private m:Landroid/graphics/drawable/Drawable;

.field private n:Z

.field private o:Ljava/util/Random;

.field private p:Z


# direct methods
.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, p0, Lcom/ijoysoft/a/a;->g:Z

    iput-boolean v0, p0, Lcom/ijoysoft/a/a;->h:Z

    iput-boolean v1, p0, Lcom/ijoysoft/a/a;->i:Z

    iput-boolean v0, p0, Lcom/ijoysoft/a/a;->j:Z

    iput-boolean v0, p0, Lcom/ijoysoft/a/a;->n:Z

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/a/a;->o:Ljava/util/Random;

    iput-boolean v1, p0, Lcom/ijoysoft/a/a;->p:Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/a/a;->k:Landroid/os/Handler;

    return-void
.end method

.method public static a()Lcom/ijoysoft/a/a;
    .locals 1

    sget-object v0, Lcom/ijoysoft/a/a;->a:Lcom/ijoysoft/a/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/ijoysoft/a/a;

    invoke-direct {v0}, Lcom/ijoysoft/a/a;-><init>()V

    sput-object v0, Lcom/ijoysoft/a/a;->a:Lcom/ijoysoft/a/a;

    :cond_0
    sget-object v0, Lcom/ijoysoft/a/a;->a:Lcom/ijoysoft/a/a;

    return-object v0
.end method

.method static synthetic a(Lcom/ijoysoft/a/a;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ijoysoft/a/a;->c(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic a(Lcom/ijoysoft/a/a;Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 4

    const/4 v3, -0x1

    invoke-virtual {p1}, Landroid/app/Activity;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/ijoysoft/a/u;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    sget v0, Lcom/ijoysoft/a/t;->d:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v2, Lcom/ijoysoft/a/t;->g:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    sget v2, Lcom/ijoysoft/a/s;->a:I

    invoke-static {p1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    new-instance v0, Landroid/app/Dialog;

    sget v2, Lcom/ijoysoft/a/w;->c:I

    invoke-direct {v0, p1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const v2, 0x3e4ccccd    # 0.2f

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    iput-object v0, p0, Lcom/ijoysoft/a/a;->l:Landroid/app/Dialog;

    iget-object v0, p0, Lcom/ijoysoft/a/a;->l:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Lcom/ijoysoft/a/a;->k:Landroid/os/Handler;

    new-instance v1, Lcom/ijoysoft/a/j;

    invoke-direct {v1, p0, p2}, Lcom/ijoysoft/a/j;-><init>(Lcom/ijoysoft/a/a;Ljava/lang/Runnable;)V

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/ijoysoft/a/a;Lcom/google/android/gms/ads/AdView;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/a/a;->e:Lcom/google/android/gms/ads/AdView;

    return-void
.end method

.method static synthetic a(Lcom/ijoysoft/a/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ijoysoft/a/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lcom/ijoysoft/a/a;->i:Z

    if-eqz v0, :cond_0

    const-string v0, "AdManager"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/ijoysoft/a/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/ijoysoft/a/a;->g:Z

    return v0
.end method

.method static synthetic b(Landroid/app/Activity;)V
    .locals 4

    const-string v0, "preference_advertisement"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "preference_key_adv_rate"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {p0}, Lcom/ijoysoft/a/a;->e(Landroid/app/Activity;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "market://details?id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "https://play.google.com/store/apps/details?id="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method private b(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 4

    const-string v0, "showRateDialog"

    invoke-direct {p0, v0}, Lcom/ijoysoft/a/a;->a(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "mAdView\u4e3a\u7a7a:"

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ijoysoft/a/a;->e:Lcom/google/android/gms/ads/AdView;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ijoysoft/a/a;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    sget v1, Lcom/ijoysoft/a/w;->a:I

    invoke-direct {v0, p1, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    new-instance v1, Lcom/ijoysoft/a/q;

    invoke-direct {v1, p1}, Lcom/ijoysoft/a/q;-><init>(Landroid/content/Context;)V

    sget v2, Lcom/ijoysoft/a/v;->j:I

    invoke-virtual {v1, v2}, Lcom/ijoysoft/a/q;->b(I)V

    sget v2, Lcom/ijoysoft/a/v;->h:I

    invoke-virtual {v1, v2}, Lcom/ijoysoft/a/q;->a(I)V

    iget-boolean v2, p0, Lcom/ijoysoft/a/a;->p:Z

    if-eqz v2, :cond_0

    sget v2, Lcom/ijoysoft/a/v;->g:I

    new-instance v3, Lcom/ijoysoft/a/p;

    invoke-direct {v3, p0, v0, p1, p2}, Lcom/ijoysoft/a/p;-><init>(Lcom/ijoysoft/a/a;Landroid/app/AlertDialog;Landroid/app/Activity;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2, v3}, Lcom/ijoysoft/a/q;->b(ILandroid/view/View$OnClickListener;)V

    :cond_0
    sget v2, Lcom/ijoysoft/a/v;->i:I

    new-instance v3, Lcom/ijoysoft/a/c;

    invoke-direct {v3, p0, v0, p1}, Lcom/ijoysoft/a/c;-><init>(Lcom/ijoysoft/a/a;Landroid/app/AlertDialog;Landroid/app/Activity;)V

    invoke-virtual {v1, v2, v3}, Lcom/ijoysoft/a/q;->a(ILandroid/view/View$OnClickListener;)V

    sget v2, Lcom/ijoysoft/a/v;->f:I

    new-instance v3, Lcom/ijoysoft/a/d;

    invoke-direct {v3, p0, v0, p2, p1}, Lcom/ijoysoft/a/d;-><init>(Lcom/ijoysoft/a/a;Landroid/app/AlertDialog;Ljava/lang/Runnable;Landroid/app/Activity;)V

    invoke-virtual {v1, v2, v3}, Lcom/ijoysoft/a/q;->c(ILandroid/view/View$OnClickListener;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setContentView(Landroid/view/View;)V

    invoke-direct {p0, p1}, Lcom/ijoysoft/a/a;->b(Landroid/content/Context;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Landroid/content/Context;)V
    .locals 3

    const-string v0, "loadAdRectView"

    invoke-direct {p0, v0}, Lcom/ijoysoft/a/a;->a(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/ads/AdView;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/ijoysoft/a/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->a(Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/ads/d;->d:Lcom/google/android/gms/ads/d;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/d;)V

    new-instance v1, Lcom/google/android/gms/ads/c;

    invoke-direct {v1}, Lcom/google/android/gms/ads/c;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/c;->a()Lcom/google/android/gms/ads/b;

    move-result-object v1

    new-instance v2, Lcom/ijoysoft/a/b;

    invoke-direct {v2, p0, v0}, Lcom/ijoysoft/a/b;-><init>(Lcom/ijoysoft/a/a;Lcom/google/android/gms/ads/AdView;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/b;)V

    return-void
.end method

.method static synthetic b(Lcom/ijoysoft/a/a;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ijoysoft/a/a;->g:Z

    return-void
.end method

.method static synthetic b(Lcom/ijoysoft/a/a;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/ijoysoft/a/a;->d(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic b(Lcom/ijoysoft/a/a;Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 7

    const/4 v6, 0x0

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/ijoysoft/a/u;->c:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    invoke-static {}, Lcom/ijoysoft/a/a;->a()Lcom/ijoysoft/a/a;

    move-result-object v0

    iget-object v0, v0, Lcom/ijoysoft/a/a;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    sget v0, Lcom/ijoysoft/a/t;->d:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/ijoysoft/a/t;->g:I

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    sget v4, Lcom/ijoysoft/a/v;->e:I

    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v1, Lcom/ijoysoft/a/s;->a:I

    invoke-static {p1, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v1, Landroid/app/Dialog;

    sget v3, Lcom/ijoysoft/a/w;->b:I

    invoke-direct {v1, p1, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v6}, Landroid/app/Dialog;->setCancelable(Z)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    invoke-direct {v3, v4, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v3}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iput-object v1, p0, Lcom/ijoysoft/a/a;->l:Landroid/app/Dialog;

    iget-object v0, p0, Lcom/ijoysoft/a/a;->l:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Lcom/ijoysoft/a/a;->k:Landroid/os/Handler;

    new-instance v1, Lcom/ijoysoft/a/k;

    invoke-direct {v1, p0, p2}, Lcom/ijoysoft/a/k;-><init>(Lcom/ijoysoft/a/a;Ljava/lang/Runnable;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private c(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/e;->b()V

    iget-boolean v0, p0, Lcom/ijoysoft/a/a;->j:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/ijoysoft/a/a;->a(Landroid/app/Activity;Z)V

    :cond_0
    return-void
.end method

.method private c(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 4

    const-string v0, "showExitDialog"

    invoke-direct {p0, v0}, Lcom/ijoysoft/a/a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ijoysoft/a/a;->e:Lcom/google/android/gms/ads/AdView;

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    sget v1, Lcom/ijoysoft/a/w;->a:I

    invoke-direct {v0, p1, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    new-instance v1, Lcom/ijoysoft/a/q;

    invoke-direct {v1, p1}, Lcom/ijoysoft/a/q;-><init>(Landroid/content/Context;)V

    sget v2, Lcom/ijoysoft/a/v;->c:I

    invoke-virtual {v1, v2}, Lcom/ijoysoft/a/q;->b(I)V

    sget v2, Lcom/ijoysoft/a/v;->d:I

    invoke-virtual {v1, v2}, Lcom/ijoysoft/a/q;->a(I)V

    sget v2, Lcom/ijoysoft/a/v;->a:I

    new-instance v3, Lcom/ijoysoft/a/e;

    invoke-direct {v3, p0, v0}, Lcom/ijoysoft/a/e;-><init>(Lcom/ijoysoft/a/a;Landroid/app/AlertDialog;)V

    invoke-virtual {v1, v2, v3}, Lcom/ijoysoft/a/q;->a(ILandroid/view/View$OnClickListener;)V

    sget v2, Lcom/ijoysoft/a/v;->b:I

    new-instance v3, Lcom/ijoysoft/a/f;

    invoke-direct {v3, p0, v0, p2}, Lcom/ijoysoft/a/f;-><init>(Lcom/ijoysoft/a/a;Landroid/app/AlertDialog;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2, v3}, Lcom/ijoysoft/a/q;->c(ILandroid/view/View$OnClickListener;)V

    iget-object v2, p0, Lcom/ijoysoft/a/a;->e:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v1, v2}, Lcom/ijoysoft/a/q;->a(Lcom/google/android/gms/ads/AdView;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setContentView(Landroid/view/View;)V

    invoke-direct {p0, p1}, Lcom/ijoysoft/a/a;->b(Landroid/content/Context;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/ijoysoft/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/ijoysoft/a/a;->l:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/a;->l:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/a;->l:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ijoysoft/a/a;->l:Landroid/app/Dialog;

    :cond_0
    return-void
.end method

.method private d(Landroid/app/Activity;)V
    .locals 4

    iget-boolean v0, p0, Lcom/ijoysoft/a/a;->h:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.MAIN"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.intent.category.HOME"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.MAIN"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.intent.category.LAUNCHER"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v2, Landroid/content/ComponentName;

    iget-object v3, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v2, v3, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p1, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method private static e(Landroid/app/Activity;)Landroid/content/pm/PackageInfo;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.android.vending"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    const-string v0, "preference_advertisement"

    invoke-virtual {p1, v0, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_key_adv_first_start"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "\u9996\u6b21\u542f\u52a8"

    invoke-direct {p0, v1}, Lcom/ijoysoft/a/a;->a(Ljava/lang/String;)V

    iput-boolean v3, p0, Lcom/ijoysoft/a/a;->n:Z

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "preference_key_adv_first_start"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :goto_0
    invoke-direct {p0, p1}, Lcom/ijoysoft/a/a;->b(Landroid/content/Context;)V

    new-instance v1, Lcom/google/android/gms/ads/AdView;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/ijoysoft/a/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/AdView;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/ads/d;->f:Lcom/google/android/gms/ads/d;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/d;)V

    const v0, 0x7f060030

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    new-instance v2, Lcom/google/android/gms/ads/c;

    invoke-direct {v2}, Lcom/google/android/gms/ads/c;-><init>()V

    invoke-virtual {v2}, Lcom/google/android/gms/ads/c;->a()Lcom/google/android/gms/ads/b;

    move-result-object v2

    new-instance v3, Lcom/ijoysoft/a/g;

    invoke-direct {v3, p0, v0}, Lcom/ijoysoft/a/g;-><init>(Lcom/ijoysoft/a/a;Landroid/widget/LinearLayout;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/a;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->a(Lcom/google/android/gms/ads/b;)V

    iget-boolean v0, p0, Lcom/ijoysoft/a/a;->g:Z

    invoke-virtual {p0, p1, v0}, Lcom/ijoysoft/a/a;->a(Landroid/app/Activity;Z)V

    return-void

    :cond_0
    iput-boolean v2, p0, Lcom/ijoysoft/a/a;->n:Z

    goto :goto_0
.end method

.method public final a(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 3

    const/4 v2, 0x0

    const-string v0, "preference_advertisement"

    invoke-virtual {p1, v0, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_key_adv_rate"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/ijoysoft/a/a;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/a;->o:Ljava/util/Random;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ijoysoft/a/a;->b(Landroid/app/Activity;Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/ijoysoft/a/a;->c(Landroid/app/Activity;Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final a(Landroid/app/Activity;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "loadInterstitialAdView:isInterstitialAdValid "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/ijoysoft/a/a;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ijoysoft/a/a;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/ijoysoft/a/a;->n:Z

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/e;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/e;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    iget-object v1, p0, Lcom/ijoysoft/a/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/e;->a(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/ads/c;

    invoke-direct {v0}, Lcom/google/android/gms/ads/c;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/c;->a()Lcom/google/android/gms/ads/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/e;->a(Lcom/google/android/gms/ads/b;)V

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    new-instance v1, Lcom/ijoysoft/a/h;

    invoke-direct {v1, p0, p2, p1}, Lcom/ijoysoft/a/h;-><init>(Lcom/ijoysoft/a/a;ZLandroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/e;->a(Lcom/google/android/gms/ads/a;)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/app/Activity;ZLjava/lang/Runnable;)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_2

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/e;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "showInterstitialAd"

    invoke-direct {p0, v0}, Lcom/ijoysoft/a/a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    new-instance v1, Lcom/ijoysoft/a/m;

    invoke-direct {v1, p0, p1}, Lcom/ijoysoft/a/m;-><init>(Lcom/ijoysoft/a/a;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/e;->a(Lcom/google/android/gms/ads/a;)V

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/e;->b()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/ijoysoft/a/a;->d(Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v1}, Lcom/ijoysoft/a/a;->a(Landroid/app/Activity;Z)V

    goto :goto_0

    :cond_2
    const-string v2, "preference_advertisement"

    invoke-virtual {p1, v2, v1}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "preference_key_adv_rate"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_4

    iget-boolean v2, p0, Lcom/ijoysoft/a/a;->n:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/ijoysoft/a/a;->o:Ljava/util/Random;

    invoke-virtual {v2, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    invoke-direct {p0, p1, p3}, Lcom/ijoysoft/a/a;->b(Landroid/app/Activity;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/e;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v1, "showInterstitialActivity"

    invoke-direct {p0, v1}, Lcom/ijoysoft/a/a;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    new-instance v2, Lcom/ijoysoft/a/o;

    invoke-direct {v2, p0, p1, p3}, Lcom/ijoysoft/a/o;-><init>(Lcom/ijoysoft/a/a;Landroid/app/Activity;Ljava/lang/Runnable;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/e;->a(Lcom/google/android/gms/ads/a;)V

    invoke-direct {p0, p1}, Lcom/ijoysoft/a/a;->c(Landroid/app/Activity;)V

    :goto_1
    if-nez v0, :cond_0

    invoke-direct {p0, p1, p3}, Lcom/ijoysoft/a/a;->c(Landroid/app/Activity;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_1
.end method

.method public final a(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "AdvertisementConfigure.properties"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    const-string v1, "adv_interstitial_id"

    const-string v2, "ca-app-pub-6282254818375654/5670833328"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ijoysoft/a/a;->b:Ljava/lang/String;

    const-string v1, "adv_rect_id"

    const-string v2, "ca-app-pub-6282254818375654/1375391328"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ijoysoft/a/a;->c:Ljava/lang/String;

    const-string v1, "adv_banner_id"

    const-string v2, "ca-app-pub-6282254818375654/7421924925"

    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ijoysoft/a/a;->d:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    new-instance v1, Lcom/ijoysoft/a/l;

    invoke-direct {v1, p0, p1}, Lcom/ijoysoft/a/l;-><init>(Lcom/ijoysoft/a/a;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/e;->a(Lcom/google/android/gms/ads/a;)V

    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/e;->b()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/ijoysoft/a/a;->f:Lcom/google/android/gms/ads/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/e;->a(Lcom/google/android/gms/ads/a;)V

    :cond_1
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ijoysoft/a/a;->g:Z

    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ijoysoft/a/a;->j:Z

    return-void
.end method

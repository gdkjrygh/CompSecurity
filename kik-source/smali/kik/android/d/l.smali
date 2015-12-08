.class public Lkik/android/d/l;
.super Lkik/android/d/b;
.source "SourceFile"


# instance fields
.field c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Runnable;Lkik/android/util/ar;)V
    .locals 1

    .prologue
    .line 15
    invoke-direct/range {p0 .. p6}, Lkik/android/d/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/Runnable;Lkik/android/util/ar;)V

    .line 16
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/d/l;->c:Z

    .line 17
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 22
    sget v0, Lkik/android/d/b$a;->a:I

    return v0
.end method

.method public final a(Lkik/android/util/ar;)V
    .locals 3

    .prologue
    .line 37
    iget-boolean v0, p0, Lkik/android/d/l;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/d/l;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    :goto_0
    return-void

    .line 40
    :cond_0
    const-string v0, "KikConfigurations"

    invoke-interface {p1, v0}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 41
    invoke-virtual {p0}, Lkik/android/d/l;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lkik/android/d/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 42
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method protected final synthetic b(Lkik/android/util/ar;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 9
    iget-boolean v0, p0, Lkik/android/d/l;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/d/l;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkik/android/d/l;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "KikConfigurations"

    invoke-interface {p1, v0}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p0}, Lkik/android/d/l;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lkik/android/d/l;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

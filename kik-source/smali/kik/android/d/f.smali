.class final Lkik/android/d/f;
.super Lkik/android/d/b;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/d/d;


# direct methods
.method constructor <init>(Lkik/android/d/d;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;[Ljava/lang/Boolean;Lkik/android/util/ar;)V
    .locals 7

    .prologue
    .line 103
    iput-object p1, p0, Lkik/android/d/f;->a:Lkik/android/d/d;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lkik/android/d/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/Runnable;Lkik/android/util/ar;)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 108
    sget v0, Lkik/android/d/b$a;->b:I

    return v0
.end method

.method protected final a(Lkik/android/util/ar;)V
    .locals 0

    .prologue
    .line 144
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    .line 103
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/d/f;->a:Lkik/android/d/d;

    invoke-static {v0}, Lkik/android/d/d;->a(Lkik/android/d/d;)Lkik/android/util/ar;

    move-result-object v0

    invoke-interface {v0}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "kik.version.number.eula"

    invoke-virtual {p0}, Lkik/android/d/f;->c()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkik/android/util/DeviceUtils;->c(Landroid/content/Context;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Lkik/android/d/f;->a:Lkik/android/d/d;

    invoke-static {v0}, Lkik/android/d/d;->a(Lkik/android/d/d;)Lkik/android/util/ar;

    move-result-object v0

    invoke-interface {v0}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "kik.version.number.eula"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method public final synthetic b()Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 103
    iget-object v1, p0, Lkik/android/d/f;->a:Lkik/android/d/d;

    invoke-static {v1}, Lkik/android/d/d;->a(Lkik/android/d/d;)Lkik/android/util/ar;

    move-result-object v1

    invoke-interface {v1}, Lkik/android/util/ar;->c()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "kik.version.number.eula"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/16 v2, 0x2d

    if-lt v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected final bridge synthetic b(Lkik/android/util/ar;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 103
    const/4 v0, 0x0

    return-object v0
.end method

.class public final Lkik/android/a/a;
.super Lcom/kik/d/f;
.source "SourceFile"


# instance fields
.field private final b:I

.field private final c:I

.field private d:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Lcom/kik/d/a;Lcom/kik/d/a/a;Landroid/content/SharedPreferences;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 27
    invoke-direct {p0, p1, p2}, Lcom/kik/d/f;-><init>(Lcom/kik/d/a;Lcom/kik/d/a/a;)V

    .line 28
    iput v2, p0, Lkik/android/a/a;->b:I

    .line 29
    const/16 v0, 0x14

    iput v0, p0, Lkik/android/a/a;->c:I

    .line 30
    iput-object p3, p0, Lkik/android/a/a;->d:Landroid/content/SharedPreferences;

    .line 31
    const-string v0, "BatchModifiableTracker.batchSizeToUse"

    invoke-interface {p3, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    const-string v0, "BatchModifiableTracker.batchSizeToUse"

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 34
    if-ne v0, v2, :cond_0

    .line 35
    invoke-virtual {p0}, Lkik/android/a/a;->d()V

    .line 38
    :cond_0
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    .prologue
    .line 42
    iget-object v0, p0, Lkik/android/a/a;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "BatchModifiableTracker.batchSizeToUse"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 44
    iget v0, p0, Lkik/android/a/a;->b:I

    invoke-virtual {p0, v0}, Lkik/android/a/a;->a(I)V

    .line 46
    invoke-virtual {p0}, Lkik/android/a/a;->a()I

    move-result v0

    iget v1, p0, Lkik/android/a/a;->b:I

    if-lt v0, v1, :cond_0

    .line 47
    invoke-virtual {p0}, Lkik/android/a/a;->b()V

    .line 49
    :cond_0
    return-void
.end method

.method public final e()V
    .locals 3

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/a/a;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "BatchModifiableTracker.batchSizeToUse"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 55
    iget v0, p0, Lkik/android/a/a;->c:I

    invoke-virtual {p0, v0}, Lkik/android/a/a;->a(I)V

    .line 57
    invoke-virtual {p0}, Lkik/android/a/a;->a()I

    move-result v0

    iget v1, p0, Lkik/android/a/a;->c:I

    if-lt v0, v1, :cond_0

    .line 58
    invoke-virtual {p0}, Lkik/android/a/a;->b()V

    .line 60
    :cond_0
    return-void
.end method

.method public final f()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 64
    iget-object v2, p0, Lkik/android/a/a;->d:Landroid/content/SharedPreferences;

    const-string v3, "BatchModifiableTracker.batchSizeToUse"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-ne v2, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

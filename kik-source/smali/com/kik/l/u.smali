.class public final Lcom/kik/l/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/e/h;


# instance fields
.field private a:Lkik/a/d/t;

.field private final b:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Lkik/android/util/ar;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const-string v0, "Kik.Storage.ContentStorage.Pref"

    invoke-interface {p1, v0}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/l/u;->b:Landroid/content/SharedPreferences;

    .line 31
    iget-object v0, p0, Lcom/kik/l/u;->a:Lkik/a/d/t;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kik/l/u;->b:Landroid/content/SharedPreferences;

    const-string v1, "MessageStub.Jid"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    new-instance v0, Lkik/a/d/t;

    iget-object v1, p0, Lcom/kik/l/u;->b:Landroid/content/SharedPreferences;

    const-string v2, "MessageStub.Jid"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/l/u;->b:Landroid/content/SharedPreferences;

    const-string v3, "MessageStub.FileLocation"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lkik/a/d/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/kik/l/u;->a:Lkik/a/d/t;

    .line 34
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Lkik/a/d/t;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/kik/l/u;->a:Lkik/a/d/t;

    return-object v0
.end method

.method public final a(Lkik/a/d/t;)V
    .locals 3

    .prologue
    .line 39
    iput-object p1, p0, Lcom/kik/l/u;->a:Lkik/a/d/t;

    .line 40
    iget-object v0, p0, Lcom/kik/l/u;->a:Lkik/a/d/t;

    if-nez v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/kik/l/u;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 46
    :goto_0
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/kik/l/u;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "MessageStub.FileLocation"

    invoke-virtual {p1}, Lkik/a/d/t;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "MessageStub.Jid"

    invoke-virtual {p1}, Lkik/a/d/t;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/kik/l/u;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/l/u;->a:Lkik/a/d/t;

    .line 59
    return-void
.end method

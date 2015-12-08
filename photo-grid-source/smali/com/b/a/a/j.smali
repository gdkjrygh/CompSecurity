.class final Lcom/b/a/a/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:La/a/a/a/a/f/c;


# direct methods
.method public constructor <init>(La/a/a/a/a/f/c;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/b/a/a/j;->a:La/a/a/a/a/f/c;

    .line 31
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .prologue
    .line 35
    iget-object v0, p0, Lcom/b/a/a/j;->a:La/a/a/a/a/f/c;

    iget-object v1, p0, Lcom/b/a/a/j;->a:La/a/a/a/a/f/c;

    invoke-interface {v1}, La/a/a/a/a/f/c;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "analytics_launched"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v0, v1}, La/a/a/a/a/f/c;->a(Landroid/content/SharedPreferences$Editor;)Z

    .line 36
    return-void
.end method

.method public final b()Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CommitPrefEdits"
        }
    .end annotation

    .prologue
    .line 40
    iget-object v0, p0, Lcom/b/a/a/j;->a:La/a/a/a/a/f/c;

    invoke-interface {v0}, La/a/a/a/a/f/c;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "analytics_launched"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

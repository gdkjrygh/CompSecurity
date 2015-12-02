.class Lcom/facebook/prefs/shared/h;
.super Ljava/lang/Object;
.source "FbSharedPreferencesContract.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Landroid/net/Uri;

.field private final e:Lcom/facebook/prefs/shared/i;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/prefs/shared/h;->a:Ljava/lang/String;

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".CHANGED_ACTION"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/prefs/shared/h;->b:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/facebook/prefs/shared/h;->c:Ljava/lang/String;

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/prefs/shared/h;->d:Landroid/net/Uri;

    .line 33
    new-instance v0, Lcom/facebook/prefs/shared/i;

    iget-object v1, p0, Lcom/facebook/prefs/shared/h;->d:Landroid/net/Uri;

    invoke-direct {v0, v1}, Lcom/facebook/prefs/shared/i;-><init>(Landroid/net/Uri;)V

    iput-object v0, p0, Lcom/facebook/prefs/shared/h;->e:Lcom/facebook/prefs/shared/i;

    .line 34
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/prefs/shared/h;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/prefs/shared/h;->e:Lcom/facebook/prefs/shared/i;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/i;->a()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/prefs/shared/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/facebook/prefs/shared/i;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/prefs/shared/h;->e:Lcom/facebook/prefs/shared/i;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/prefs/shared/h;->c:Ljava/lang/String;

    return-object v0
.end method

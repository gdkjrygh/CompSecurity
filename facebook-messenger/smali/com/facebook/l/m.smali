.class Lcom/facebook/l/m;
.super Ljava/lang/Object;
.source "PresenceManager.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/l/k;


# direct methods
.method constructor <init>(Lcom/facebook/l/k;)V
    .locals 0

    .prologue
    .line 184
    iput-object p1, p0, Lcom/facebook/l/m;->a:Lcom/facebook/l/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 188
    invoke-static {}, Lcom/facebook/l/k;->i()Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/push/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/facebook/l/m;->a:Lcom/facebook/l/k;

    invoke-static {v0}, Lcom/facebook/l/k;->b(Lcom/facebook/l/k;)V

    .line 192
    :cond_1
    return-void
.end method

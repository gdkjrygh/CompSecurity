.class Lcom/facebook/h/b;
.super Ljava/lang/Object;
.source "LogController.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/h/a;


# direct methods
.method constructor <init>(Lcom/facebook/h/a;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/facebook/h/b;->a:Lcom/facebook/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/facebook/prefs/shared/aj;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/prefs/shared/aj;->j:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/facebook/h/b;->a:Lcom/facebook/h/a;

    invoke-virtual {v0}, Lcom/facebook/h/a;->b()V

    .line 40
    :cond_1
    return-void
.end method

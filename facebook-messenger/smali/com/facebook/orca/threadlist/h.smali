.class Lcom/facebook/orca/threadlist/h;
.super Ljava/lang/Object;
.source "MuteGlobalWarningController.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/f;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/f;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/facebook/orca/threadlist/h;->a:Lcom/facebook/orca/threadlist/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/threadlist/h;->a:Lcom/facebook/orca/threadlist/f;

    invoke-static {v0, p2}, Lcom/facebook/orca/threadlist/f;->a(Lcom/facebook/orca/threadlist/f;Lcom/facebook/prefs/shared/ae;)V

    .line 43
    return-void
.end method

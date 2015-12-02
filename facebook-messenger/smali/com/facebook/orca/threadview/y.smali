.class Lcom/facebook/orca/threadview/y;
.super Ljava/lang/Object;
.source "MuteThreadWarningController.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/w;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/w;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/orca/threadview/y;->a:Lcom/facebook/orca/threadview/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/threadview/y;->a:Lcom/facebook/orca/threadview/w;

    invoke-static {v0, p2}, Lcom/facebook/orca/threadview/w;->a(Lcom/facebook/orca/threadview/w;Lcom/facebook/prefs/shared/ae;)V

    .line 50
    return-void
.end method

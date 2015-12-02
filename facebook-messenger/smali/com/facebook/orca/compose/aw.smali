.class Lcom/facebook/orca/compose/aw;
.super Ljava/lang/Object;
.source "LocationNuxController.java"

# interfaces
.implements Lcom/facebook/orca/prefs/ba;


# instance fields
.field final synthetic a:Lcom/facebook/orca/compose/av;


# direct methods
.method constructor <init>(Lcom/facebook/orca/compose/av;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/facebook/orca/compose/aw;->a:Lcom/facebook/orca/compose/av;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/compose/aw;->a:Lcom/facebook/orca/compose/av;

    iget-object v1, p0, Lcom/facebook/orca/compose/aw;->a:Lcom/facebook/orca/compose/av;

    invoke-static {v1}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/av;)Lcom/facebook/orca/compose/ax;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/compose/av;->a(Lcom/facebook/orca/compose/av;Lcom/facebook/orca/compose/ax;)V

    .line 48
    return-void
.end method

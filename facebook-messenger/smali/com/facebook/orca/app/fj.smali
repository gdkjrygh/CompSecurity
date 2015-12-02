.class public Lcom/facebook/orca/app/fj;
.super Lcom/facebook/auth/a/a;
.source "OrcaDataManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/fg;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/app/fg;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/facebook/orca/app/fj;->a:Lcom/facebook/orca/app/fg;

    invoke-direct {p0}, Lcom/facebook/auth/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/app/fj;->a:Lcom/facebook/orca/app/fg;

    invoke-static {v0}, Lcom/facebook/orca/app/fg;->a(Lcom/facebook/orca/app/fg;)V

    .line 44
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/app/fj;->a:Lcom/facebook/orca/app/fg;

    invoke-virtual {v0}, Lcom/facebook/orca/app/fg;->b()V

    .line 49
    return-void
.end method

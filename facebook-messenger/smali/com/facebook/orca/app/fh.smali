.class Lcom/facebook/orca/app/fh;
.super Ljava/lang/Object;
.source "OrcaDataManager.java"

# interfaces
.implements Lcom/facebook/prefs/shared/f;


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/fg;


# direct methods
.method constructor <init>(Lcom/facebook/orca/app/fg;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/facebook/orca/app/fh;->a:Lcom/facebook/orca/app/fg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/prefs/shared/d;Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 137
    sget-object v0, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/orca/app/fg;->d()Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/orca/app/fg;->e()Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/app/fh;->a:Lcom/facebook/orca/app/fg;

    invoke-static {v0, p2}, Lcom/facebook/orca/app/fg;->a(Lcom/facebook/orca/app/fg;Lcom/facebook/prefs/shared/ae;)V

    .line 142
    :cond_1
    return-void
.end method

.class Lcom/facebook/orca/contacts/divebar/ai;
.super Ljava/lang/Object;
.source "DivebarLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/an;

.field final synthetic b:Lcom/facebook/orca/contacts/divebar/ad;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/ad;Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 0

    .prologue
    .line 512
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ai;->b:Lcom/facebook/orca/contacts/divebar/ad;

    iput-object p2, p0, Lcom/facebook/orca/contacts/divebar/ai;->a:Lcom/facebook/orca/contacts/divebar/an;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 516
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ai;->b:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/ad;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 517
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ai;->b:Lcom/facebook/orca/contacts/divebar/ad;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ai;->a:Lcom/facebook/orca/contacts/divebar/an;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/divebar/ad;->b(Ljava/lang/Object;)V

    .line 519
    :cond_0
    return-void
.end method

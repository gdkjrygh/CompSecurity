.class Lcom/facebook/orca/contacts/divebar/ag;
.super Ljava/lang/Object;
.source "DivebarLoader.java"

# interfaces
.implements Lcom/facebook/contacts/data/r;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/ad;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/ad;)V
    .locals 0

    .prologue
    .line 323
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ag;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 326
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ag;->a:Lcom/facebook/orca/contacts/divebar/ad;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/ag;->a:Lcom/facebook/orca/contacts/divebar/ad;

    invoke-static {v1}, Lcom/facebook/orca/contacts/divebar/ad;->b(Lcom/facebook/orca/contacts/divebar/ad;)Lcom/facebook/orca/contacts/divebar/an;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/divebar/ad;->a(Lcom/facebook/orca/contacts/divebar/ad;Lcom/facebook/orca/contacts/divebar/an;)V

    .line 327
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 332
    return-void
.end method

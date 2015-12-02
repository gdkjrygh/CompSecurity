.class public Lcom/facebook/orca/contacts/divebar/ax;
.super Ljava/lang/Object;
.source "DivebarNearbyFriendsRow.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ad;


# instance fields
.field private a:Lcom/facebook/orca/contacts/divebar/bb;

.field private b:Lcom/facebook/orca/contacts/divebar/av;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/contacts/divebar/av;)Lcom/facebook/orca/contacts/divebar/ax;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ax;->b:Lcom/facebook/orca/contacts/divebar/av;

    .line 25
    return-object p0
.end method

.method public a(Lcom/facebook/orca/contacts/divebar/bb;)Lcom/facebook/orca/contacts/divebar/ax;
    .locals 0

    .prologue
    .line 15
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/ax;->a:Lcom/facebook/orca/contacts/divebar/bb;

    .line 16
    return-object p0
.end method

.method public a()Lcom/facebook/orca/contacts/divebar/bb;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ax;->a:Lcom/facebook/orca/contacts/divebar/bb;

    return-object v0
.end method

.method public b()Lcom/facebook/orca/contacts/divebar/av;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/ax;->b:Lcom/facebook/orca/contacts/divebar/av;

    return-object v0
.end method

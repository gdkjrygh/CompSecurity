.class public Lcom/facebook/orca/contacts/picker/ag;
.super Ljava/lang/Object;
.source "ContactPickerInviteFriendsRowBuilder.java"


# instance fields
.field private a:Lcom/facebook/orca/contacts/picker/aj;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/picker/af;
    .locals 1

    .prologue
    .line 13
    new-instance v0, Lcom/facebook/orca/contacts/picker/af;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/picker/af;-><init>(Lcom/facebook/orca/contacts/picker/ag;)V

    return-object v0
.end method

.method public a(Lcom/facebook/orca/contacts/picker/aj;)Lcom/facebook/orca/contacts/picker/ag;
    .locals 0

    .prologue
    .line 18
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ag;->a:Lcom/facebook/orca/contacts/picker/aj;

    .line 20
    return-object p0
.end method

.method public b()Lcom/facebook/orca/contacts/picker/aj;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ag;->a:Lcom/facebook/orca/contacts/picker/aj;

    return-object v0
.end method

.class public Lcom/facebook/orca/contacts/picker/af;
.super Ljava/lang/Object;
.source "ContactPickerInviteFriendsRow.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ad;


# instance fields
.field private final a:Lcom/facebook/orca/contacts/picker/aj;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/contacts/picker/ag;)V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/picker/ag;->b()Lcom/facebook/orca/contacts/picker/aj;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/af;->a:Lcom/facebook/orca/contacts/picker/aj;

    .line 15
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/contacts/picker/aj;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/af;->a:Lcom/facebook/orca/contacts/picker/aj;

    return-object v0
.end method

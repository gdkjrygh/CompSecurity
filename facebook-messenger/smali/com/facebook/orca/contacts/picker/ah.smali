.class public Lcom/facebook/orca/contacts/picker/ah;
.super Lcom/facebook/widget/f;
.source "ContactPickerInviteFriendsView.java"


# instance fields
.field private final a:Landroid/widget/Button;

.field private b:Lcom/facebook/orca/contacts/picker/aj;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 28
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/contacts/picker/ah;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    sget v0, Lcom/facebook/k;->orca_contact_picker_invite_friends:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ah;->setContentView(I)V

    .line 40
    sget v0, Lcom/facebook/i;->invite_friends_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ah;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ah;->a:Landroid/widget/Button;

    .line 41
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ah;->a:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/contacts/picker/ai;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/picker/ai;-><init>(Lcom/facebook/orca/contacts/picker/ah;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/picker/ah;)Lcom/facebook/orca/contacts/picker/aj;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ah;->b:Lcom/facebook/orca/contacts/picker/aj;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/contacts/picker/aj;)Lcom/facebook/orca/contacts/picker/ah;
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ah;->b:Lcom/facebook/orca/contacts/picker/aj;

    .line 54
    return-object p0
.end method

.class public Lcom/facebook/contacts/contactcard/entry/l;
.super Lcom/facebook/contacts/contactcard/entry/h;
.source "PhoneEntryView.java"


# instance fields
.field private final a:Lcom/facebook/user/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/entry/l;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactcard/entry/l;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 30
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/contacts/contactcard/entry/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/entry/l;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 33
    const-class v1, Lcom/facebook/user/i;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/i;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/entry/l;->a:Lcom/facebook/user/i;

    .line 34
    return-void
.end method


# virtual methods
.method protected a(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 38
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/entry/l;->getEntry()Lcom/facebook/contacts/models/entry/Entry;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    .line 40
    invoke-virtual {v0}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 48
    sget v0, Lcom/facebook/o;->contact_phone_type_other:I

    .line 51
    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 52
    return-void

    .line 42
    :pswitch_0
    sget v0, Lcom/facebook/o;->contact_phone_type_mobile:I

    goto :goto_0

    .line 45
    :pswitch_1
    sget v0, Lcom/facebook/o;->contact_phone_type_home:I

    goto :goto_0

    .line 40
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected b(Landroid/widget/TextView;)V
    .locals 2

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/entry/l;->getEntry()Lcom/facebook/contacts/models/entry/Entry;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    .line 57
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/entry/l;->a:Lcom/facebook/user/i;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/entry/PhoneEntry;->getNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    return-void
.end method

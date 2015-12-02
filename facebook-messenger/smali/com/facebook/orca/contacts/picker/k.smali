.class public Lcom/facebook/orca/contacts/picker/k;
.super Lcom/facebook/widget/f;
.source "ContactPickerAddPhoneOrEmailView.java"


# static fields
.field private static final a:Landroid/text/style/StyleSpan;


# instance fields
.field private final b:Landroid/view/View;

.field private final c:Landroid/widget/TextView;

.field private final d:Landroid/view/View;

.field private final e:Lcom/facebook/user/i;

.field private final f:Lcom/facebook/analytics/av;

.field private final g:Lcom/facebook/c/s;

.field private h:Lcom/facebook/contacts/picker/ad;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 34
    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/style/StyleSpan;-><init>(I)V

    sput-object v0, Lcom/facebook/orca/contacts/picker/k;->a:Landroid/text/style/StyleSpan;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/contacts/picker/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/contacts/picker/k;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 54
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    sget v0, Lcom/facebook/k;->orca_contact_picker_additional_list_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/k;->setContentView(I)V

    .line 56
    sget v0, Lcom/facebook/i;->contact_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/k;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->b:Landroid/view/View;

    .line 57
    sget v0, Lcom/facebook/i;->additional_text_field:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/k;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->c:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/facebook/i;->contact_divider:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/k;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->d:Landroid/view/View;

    .line 60
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 61
    const-class v0, Lcom/facebook/user/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/i;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->e:Lcom/facebook/user/i;

    .line 62
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->f:Lcom/facebook/analytics/av;

    .line 63
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->g:Lcom/facebook/c/s;

    .line 64
    return-void
.end method

.method private a(ILjava/lang/String;)Landroid/text/SpannableString;
    .locals 5

    .prologue
    .line 142
    new-instance v0, Landroid/text/SpannableString;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/k;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 145
    sget-object v1, Lcom/facebook/orca/contacts/picker/k;->a:Landroid/text/style/StyleSpan;

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/16 v4, 0x11

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 150
    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->h:Lcom/facebook/contacts/picker/ad;

    instance-of v0, v0, Lcom/facebook/contacts/picker/t;

    if-eqz v0, :cond_0

    .line 99
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/k;->c()V

    .line 105
    :goto_0
    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->h:Lcom/facebook/contacts/picker/ad;

    instance-of v0, v0, Lcom/facebook/orca/contacts/picker/j;

    if-eqz v0, :cond_1

    .line 101
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/k;->b()V

    goto :goto_0

    .line 103
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Row is either null or row type is not supported."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/picker/k;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/k;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 154
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->f:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "view"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "contact_picker_invite_person_by_phone"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 158
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/k;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/activity/AddContactsActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 159
    const-string v1, "phone_number"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 160
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/k;->g:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/k;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 161
    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->h:Lcom/facebook/contacts/picker/ad;

    check-cast v0, Lcom/facebook/orca/contacts/picker/j;

    .line 112
    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/j;->b()Lcom/facebook/user/s;

    move-result-object v1

    sget-object v2, Lcom/facebook/user/s;->EMAIL:Lcom/facebook/user/s;

    if-ne v1, v2, :cond_0

    .line 113
    sget v1, Lcom/facebook/o;->add_person_by_email_auto_complete_text:I

    .line 114
    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/j;->a()Ljava/lang/String;

    move-result-object v0

    .line 120
    :goto_0
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/k;->c:Landroid/widget/TextView;

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/contacts/picker/k;->a(ILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    return-void

    .line 116
    :cond_0
    sget v1, Lcom/facebook/o;->add_person_by_phone_auto_complete_text:I

    .line 117
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/k;->e:Lcom/facebook/user/i;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/user/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private c()V
    .locals 4

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->h:Lcom/facebook/contacts/picker/ad;

    check-cast v0, Lcom/facebook/contacts/picker/t;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/t;->a()Ljava/lang/String;

    move-result-object v0

    .line 126
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/k;->e:Lcom/facebook/user/i;

    invoke-virtual {v1, v0}, Lcom/facebook/user/i;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 127
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/k;->c:Landroid/widget/TextView;

    sget v3, Lcom/facebook/o;->invite_person_by_phone_auto_complete_text:I

    invoke-direct {p0, v3, v1}, Lcom/facebook/orca/contacts/picker/k;->a(ILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    new-instance v1, Lcom/facebook/orca/contacts/picker/l;

    invoke-direct {v1, p0, v0}, Lcom/facebook/orca/contacts/picker/l;-><init>(Lcom/facebook/orca/contacts/picker/k;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/k;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    return-void
.end method


# virtual methods
.method public setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V
    .locals 4

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/k;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 68
    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DEFAULT_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v1, :cond_2

    .line 69
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/k;->b:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 70
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/k;->c:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 71
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/k;->c:Landroid/widget/TextView;

    sget v2, Lcom/facebook/f;->default_contacts_section_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/k;->d:Landroid/view/View;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    sget v2, Lcom/facebook/h;->default_separator_color:I

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 85
    :cond_1
    :goto_0
    return-void

    .line 76
    :cond_2
    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v1, :cond_1

    .line 77
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/k;->b:Landroid/view/View;

    sget v2, Lcom/facebook/h;->divebar_contact_bg:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 79
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/k;->c:Landroid/widget/TextView;

    if-eqz v1, :cond_3

    .line 80
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/k;->c:Landroid/widget/TextView;

    sget v2, Lcom/facebook/f;->divebar_contact_name_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 82
    :cond_3
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/k;->d:Landroid/view/View;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lcom/facebook/f;->divebar_contact_divider:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-direct {v2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public setContactRow(Lcom/facebook/contacts/picker/ad;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/k;->h:Lcom/facebook/contacts/picker/ad;

    .line 94
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/k;->a()V

    .line 95
    return-void
.end method

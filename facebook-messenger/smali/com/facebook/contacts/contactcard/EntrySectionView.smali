.class public Lcom/facebook/contacts/contactcard/EntrySectionView;
.super Lcom/facebook/widget/e;
.source "EntrySectionView.java"


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Lcom/facebook/contacts/contactcard/SectionView;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/contacts/contactcard/entry/h;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/facebook/contacts/contactcard/entry/b;

.field private e:Lcom/facebook/contacts/models/EntrySection;

.field private f:Lcom/facebook/contacts/contactcard/af;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 57
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->setOrientation(I)V

    .line 59
    sget v0, Lcom/facebook/k;->contacts_entry_section_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->setContentView(I)V

    .line 60
    sget v0, Lcom/facebook/i;->entry_section_label:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->a:Landroid/widget/TextView;

    .line 61
    sget v0, Lcom/facebook/i;->entry_section_section_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/SectionView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->b:Lcom/facebook/contacts/contactcard/SectionView;

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->c:Ljava/util/ArrayList;

    .line 64
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/EntrySectionView;)Lcom/facebook/contacts/contactcard/af;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->f:Lcom/facebook/contacts/contactcard/af;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 137
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 138
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->b:Lcom/facebook/contacts/contactcard/SectionView;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/SectionView;->setVisibility(I)V

    .line 139
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->b:Lcom/facebook/contacts/contactcard/SectionView;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/SectionView;->b()V

    .line 140
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 141
    return-void
.end method

.method private a(Lcom/facebook/contacts/models/entry/Entry;)V
    .locals 3

    .prologue
    .line 146
    sget-object v0, Lcom/facebook/contacts/contactcard/ae;->a:[I

    invoke-interface {p1}, Lcom/facebook/contacts/models/entry/Entry;->a()Lcom/facebook/contacts/models/entry/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/models/entry/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 185
    :goto_0
    return-void

    .line 148
    :pswitch_0
    new-instance v0, Lcom/facebook/contacts/contactcard/entry/l;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/contacts/contactcard/entry/l;-><init>(Landroid/content/Context;)V

    .line 162
    :goto_1
    invoke-virtual {v0, p1}, Lcom/facebook/contacts/contactcard/entry/h;->setEntry(Lcom/facebook/contacts/models/entry/Entry;)V

    .line 163
    new-instance v1, Lcom/facebook/contacts/contactcard/ad;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/ad;-><init>(Lcom/facebook/contacts/contactcard/EntrySectionView;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/entry/h;->setEntryViewListener(Lcom/facebook/contacts/contactcard/entry/k;)V

    .line 181
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->b:Lcom/facebook/contacts/contactcard/SectionView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/contactcard/SectionView;->setVisibility(I)V

    .line 183
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->b:Lcom/facebook/contacts/contactcard/SectionView;

    invoke-virtual {v1, v0}, Lcom/facebook/contacts/contactcard/SectionView;->b(Landroid/view/View;)V

    .line 184
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 151
    :pswitch_1
    new-instance v0, Lcom/facebook/contacts/contactcard/entry/g;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/contacts/contactcard/entry/g;-><init>(Landroid/content/Context;)V

    goto :goto_1

    .line 154
    :pswitch_2
    new-instance v0, Lcom/facebook/contacts/contactcard/entry/a;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/contacts/contactcard/entry/a;-><init>(Landroid/content/Context;)V

    goto :goto_1

    .line 157
    :pswitch_3
    new-instance v0, Lcom/facebook/contacts/contactcard/entry/f;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/contacts/contactcard/entry/f;-><init>(Landroid/content/Context;)V

    goto :goto_1

    .line 146
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public getAddEntryValue()Ljava/lang/String;
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    if-nez v0, :cond_0

    .line 131
    const/4 v0, 0x0

    .line 133
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-virtual {v0}, Lcom/facebook/contacts/contactcard/entry/b;->getInputValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getEntrySection()Lcom/facebook/contacts/models/EntrySection;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->e:Lcom/facebook/contacts/models/EntrySection;

    return-object v0
.end method

.method public setEditMode(Z)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 89
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/entry/h;

    .line 90
    invoke-virtual {v0, p1}, Lcom/facebook/contacts/contactcard/entry/h;->setEditMode(Z)V

    goto :goto_0

    .line 93
    :cond_0
    if-eqz p1, :cond_6

    .line 95
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    if-nez v0, :cond_1

    .line 96
    new-instance v0, Lcom/facebook/contacts/contactcard/entry/b;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/contacts/contactcard/entry/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    .line 97
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    new-instance v2, Lcom/facebook/contacts/contactcard/ac;

    invoke-direct {v2, p0}, Lcom/facebook/contacts/contactcard/ac;-><init>(Lcom/facebook/contacts/contactcard/EntrySectionView;)V

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/entry/b;->setListener(Lcom/facebook/contacts/contactcard/entry/e;)V

    .line 113
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->e:Lcom/facebook/contacts/models/EntrySection;

    if-eqz v0, :cond_2

    .line 114
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->e:Lcom/facebook/contacts/models/EntrySection;

    invoke-virtual {v0}, Lcom/facebook/contacts/models/EntrySection;->getHiddenEntries()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lez v0, :cond_5

    const/4 v0, 0x1

    .line 115
    :goto_1
    iget-object v2, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-virtual {v2, v0}, Lcom/facebook/contacts/contactcard/entry/b;->setPlusButtonVisibility(Z)V

    .line 117
    :cond_2
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->b:Lcom/facebook/contacts/contactcard/SectionView;

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/SectionView;->b(Landroid/view/View;)V

    .line 124
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 125
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->b:Lcom/facebook/contacts/contactcard/SectionView;

    if-eqz p1, :cond_7

    :goto_3
    invoke-virtual {v0, v1}, Lcom/facebook/contacts/contactcard/SectionView;->setVisibility(I)V

    .line 127
    :cond_4
    return-void

    :cond_5
    move v0, v1

    .line 114
    goto :goto_1

    .line 119
    :cond_6
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    if-eqz v0, :cond_3

    .line 120
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->b:Lcom/facebook/contacts/contactcard/SectionView;

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/SectionView;->a(Landroid/view/View;)V

    goto :goto_2

    .line 125
    :cond_7
    const/16 v1, 0x8

    goto :goto_3
.end method

.method public setEntryListener(Lcom/facebook/contacts/contactcard/af;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->f:Lcom/facebook/contacts/contactcard/af;

    .line 68
    return-void
.end method

.method public setEntrySection(Lcom/facebook/contacts/models/EntrySection;)V
    .locals 2

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->e:Lcom/facebook/contacts/models/EntrySection;

    .line 73
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/facebook/contacts/models/EntrySection;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->a()V

    .line 75
    invoke-virtual {p1}, Lcom/facebook/contacts/models/EntrySection;->getEntries()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/entry/PhoneEntry;

    .line 76
    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/EntrySectionView;->a(Lcom/facebook/contacts/models/entry/Entry;)V

    goto :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    if-eqz v0, :cond_1

    .line 79
    invoke-virtual {p1}, Lcom/facebook/contacts/models/EntrySection;->getHiddenEntries()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    .line 80
    :goto_1
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/EntrySectionView;->d:Lcom/facebook/contacts/contactcard/entry/b;

    invoke-virtual {v1, v0}, Lcom/facebook/contacts/contactcard/entry/b;->setPlusButtonVisibility(Z)V

    .line 82
    :cond_1
    return-void

    .line 79
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

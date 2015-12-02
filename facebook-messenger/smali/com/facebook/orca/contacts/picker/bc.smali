.class public Lcom/facebook/orca/contacts/picker/bc;
.super Lcom/facebook/contacts/picker/c;
.source "ContactPickerViewListAdapter.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<+",
            "Lcom/facebook/contacts/picker/u;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/view/LayoutInflater;

.field private final e:Lcom/facebook/user/i;

.field private f:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/facebook/contacts/picker/u;

.field private i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/orca/contacts/picker/bc;

    sput-object v0, Lcom/facebook/orca/contacts/picker/bc;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljavax/inject/a;Landroid/view/LayoutInflater;Lcom/facebook/user/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljavax/inject/a",
            "<+",
            "Lcom/facebook/contacts/picker/u;",
            ">;",
            "Landroid/view/LayoutInflater;",
            "Lcom/facebook/user/i;",
            ")V"
        }
    .end annotation

    .prologue
    .line 70
    invoke-direct {p0}, Lcom/facebook/contacts/picker/c;-><init>()V

    .line 59
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->f:Lcom/google/common/a/es;

    .line 60
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->g:Lcom/google/common/a/es;

    .line 64
    sget-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DEFAULT_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    .line 71
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    .line 72
    iput-object p2, p0, Lcom/facebook/orca/contacts/picker/bc;->c:Ljavax/inject/a;

    .line 73
    iput-object p3, p0, Lcom/facebook/orca/contacts/picker/bc;->d:Landroid/view/LayoutInflater;

    .line 74
    iput-object p4, p0, Lcom/facebook/orca/contacts/picker/bc;->e:Lcom/facebook/user/i;

    .line 75
    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 277
    check-cast p1, Lcom/facebook/orca/contacts/picker/s;

    .line 279
    if-nez p1, :cond_0

    .line 280
    new-instance p1, Lcom/facebook/orca/contacts/picker/s;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/facebook/orca/contacts/picker/s;-><init>(Landroid/content/Context;)V

    .line 281
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p1, v0}, Lcom/facebook/orca/contacts/picker/s;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 284
    :cond_0
    return-object p1
.end method

.method private a(Landroid/view/View;Lcom/facebook/orca/contacts/picker/af;)Landroid/view/View;
    .locals 1

    .prologue
    .line 351
    check-cast p1, Lcom/facebook/orca/contacts/picker/ah;

    .line 352
    if-nez p1, :cond_0

    .line 353
    new-instance p1, Lcom/facebook/orca/contacts/picker/ah;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/facebook/orca/contacts/picker/ah;-><init>(Landroid/content/Context;)V

    .line 356
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/orca/contacts/picker/af;->a()Lcom/facebook/orca/contacts/picker/aj;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/orca/contacts/picker/ah;->a(Lcom/facebook/orca/contacts/picker/aj;)Lcom/facebook/orca/contacts/picker/ah;

    .line 357
    return-object p1
.end method

.method private a(Lcom/facebook/contacts/picker/ae;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 314
    check-cast p2, Lcom/facebook/orca/contacts/picker/ba;

    .line 315
    if-nez p2, :cond_0

    .line 316
    new-instance p2, Lcom/facebook/orca/contacts/picker/ba;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/picker/ba;-><init>(Landroid/content/Context;)V

    .line 317
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/ba;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 319
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/ba;->setText(Ljava/lang/String;)V

    .line 321
    return-object p2
.end method

.method private a(Lcom/facebook/contacts/picker/af;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 328
    check-cast p2, Lcom/facebook/orca/contacts/picker/bb;

    .line 329
    if-nez p2, :cond_0

    .line 330
    new-instance p2, Lcom/facebook/orca/contacts/picker/bb;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/picker/bb;-><init>(Landroid/content/Context;)V

    .line 331
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/bb;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 334
    :cond_0
    return-object p2
.end method

.method private a(Lcom/facebook/contacts/picker/ag;Landroid/view/View;)Landroid/view/View;
    .locals 1

    .prologue
    .line 231
    check-cast p2, Lcom/facebook/orca/contacts/picker/ao;

    .line 232
    if-nez p2, :cond_0

    .line 233
    new-instance p2, Lcom/facebook/orca/contacts/picker/ao;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/picker/ao;-><init>(Landroid/content/Context;)V

    .line 234
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/ao;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 236
    :cond_0
    invoke-virtual {p2, p1}, Lcom/facebook/orca/contacts/picker/ao;->setContactRow(Lcom/facebook/contacts/picker/ag;)V

    .line 237
    return-object p2
.end method

.method private a(Lcom/facebook/contacts/picker/t;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 254
    check-cast p2, Lcom/facebook/orca/contacts/picker/k;

    .line 255
    if-nez p2, :cond_0

    .line 256
    new-instance p2, Lcom/facebook/orca/contacts/picker/k;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/picker/k;-><init>(Landroid/content/Context;)V

    .line 257
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/k;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 259
    :cond_0
    invoke-virtual {p2, p1}, Lcom/facebook/orca/contacts/picker/k;->setContactRow(Lcom/facebook/contacts/picker/ad;)V

    .line 260
    return-object p2
.end method

.method private a(Lcom/facebook/orca/contacts/divebar/ax;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 301
    check-cast p2, Lcom/facebook/orca/contacts/divebar/ay;

    .line 302
    if-nez p2, :cond_0

    .line 303
    new-instance p2, Lcom/facebook/orca/contacts/divebar/ay;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/divebar/ay;-><init>(Landroid/content/Context;)V

    .line 305
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/ax;->a()Lcom/facebook/orca/contacts/divebar/bb;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/divebar/ay;->a(Lcom/facebook/orca/contacts/divebar/bb;)Lcom/facebook/orca/contacts/divebar/ay;

    .line 306
    invoke-virtual {p1}, Lcom/facebook/orca/contacts/divebar/ax;->b()Lcom/facebook/orca/contacts/divebar/av;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/divebar/ay;->a(Lcom/facebook/orca/contacts/divebar/av;)Lcom/facebook/orca/contacts/divebar/ay;

    .line 307
    return-object p2
.end method

.method private a(Lcom/facebook/orca/contacts/picker/ad;Landroid/view/View;)Landroid/view/View;
    .locals 1

    .prologue
    .line 241
    check-cast p2, Lcom/facebook/orca/contacts/picker/an;

    .line 242
    if-nez p2, :cond_0

    .line 243
    new-instance p2, Lcom/facebook/orca/contacts/picker/an;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/picker/an;-><init>(Landroid/content/Context;)V

    .line 244
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/an;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 246
    :cond_0
    invoke-virtual {p2, p1}, Lcom/facebook/orca/contacts/picker/an;->setContactRow(Lcom/facebook/orca/contacts/picker/ad;)V

    .line 247
    return-object p2
.end method

.method private a(Lcom/facebook/orca/contacts/picker/j;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 267
    check-cast p2, Lcom/facebook/orca/contacts/picker/k;

    .line 268
    if-nez p2, :cond_0

    .line 269
    new-instance p2, Lcom/facebook/orca/contacts/picker/k;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/picker/k;-><init>(Landroid/content/Context;)V

    .line 270
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/k;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 272
    :cond_0
    invoke-virtual {p2, p1}, Lcom/facebook/orca/contacts/picker/k;->setContactRow(Lcom/facebook/contacts/picker/ad;)V

    .line 273
    return-object p2
.end method

.method private b(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 288
    check-cast p1, Lcom/facebook/orca/contacts/divebar/bc;

    .line 290
    if-nez p1, :cond_0

    .line 291
    new-instance p1, Lcom/facebook/orca/contacts/divebar/bc;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/facebook/orca/contacts/divebar/bc;-><init>(Landroid/content/Context;)V

    .line 294
    :cond_0
    return-object p1
.end method

.method private c(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 338
    .line 339
    if-nez p1, :cond_0

    .line 340
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->d:Landroid/view/LayoutInflater;

    sget v1, Lcom/facebook/k;->orca_contact_picker_new_group:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 341
    sget v0, Lcom/facebook/i;->contact_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    check-cast v0, Landroid/widget/TextView;

    .line 342
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/f;->default_contacts_section_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 345
    :cond_0
    return-object p1
.end method

.method private d(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 361
    check-cast p1, Lcom/facebook/orca/contacts/picker/ap;

    .line 362
    if-nez p1, :cond_0

    .line 363
    new-instance p1, Lcom/facebook/orca/contacts/picker/ap;

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->b:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/facebook/orca/contacts/picker/ap;-><init>(Landroid/content/Context;)V

    .line 366
    :cond_0
    return-object p1
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/picker/u;
    .locals 1

    .prologue
    .line 371
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->h:Lcom/facebook/contacts/picker/u;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->c:Ljavax/inject/a;

    if-eqz v0, :cond_0

    .line 372
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/u;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->h:Lcom/facebook/contacts/picker/u;

    .line 373
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->h:Lcom/facebook/contacts/picker/u;

    invoke-interface {v0, p0}, Lcom/facebook/contacts/picker/u;->a(Lcom/facebook/contacts/picker/w;)V

    .line 375
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->h:Lcom/facebook/contacts/picker/u;

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bc;->i:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    .line 81
    return-void
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 85
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bc;->f:Lcom/google/common/a/es;

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->f:Lcom/google/common/a/es;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->g:Lcom/google/common/a/es;

    .line 87
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bc;->notifyDataSetChanged()V

    .line 88
    return-void
.end method

.method public a(Ljava/lang/CharSequence;Lcom/facebook/contacts/picker/l;)V
    .locals 2

    .prologue
    .line 96
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    sget-object v0, Lcom/facebook/orca/contacts/picker/bd;->a:[I

    invoke-virtual {p2}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/m;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 106
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bc;->b(Lcom/google/common/a/es;)V

    .line 109
    :goto_0
    return-void

    .line 99
    :pswitch_0
    invoke-virtual {p2}, Lcom/facebook/contacts/picker/l;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/bc;->b(Lcom/google/common/a/es;)V

    goto :goto_0

    .line 102
    :pswitch_1
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bc;->b()V

    goto :goto_0

    .line 97
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 185
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->f:Lcom/google/common/a/es;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->g:Lcom/google/common/a/es;

    .line 114
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->g:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 115
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bc;->notifyDataSetChanged()V

    .line 119
    :goto_0
    return-void

    .line 117
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bc;->notifyDataSetInvalidated()V

    goto :goto_0
.end method

.method b(Lcom/google/common/a/es;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 122
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/bc;->g:Lcom/google/common/a/es;

    .line 123
    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 124
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bc;->notifyDataSetChanged()V

    .line 128
    :goto_0
    return-void

    .line 126
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bc;->notifyDataSetInvalidated()V

    goto :goto_0
.end method

.method public synthetic c()Lcom/facebook/widget/a/f;
    .locals 1

    .prologue
    .line 34
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/bc;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->g:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->g:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 180
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 4

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->g:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ad;

    .line 138
    instance-of v1, v0, Lcom/facebook/contacts/picker/ag;

    if-eqz v1, :cond_0

    .line 139
    const/4 v0, 0x1

    .line 161
    :goto_0
    return v0

    .line 140
    :cond_0
    instance-of v1, v0, Lcom/facebook/orca/contacts/picker/ad;

    if-eqz v1, :cond_1

    .line 141
    const/16 v0, 0x9

    goto :goto_0

    .line 142
    :cond_1
    instance-of v1, v0, Lcom/facebook/orca/contacts/picker/j;

    if-eqz v1, :cond_2

    .line 143
    const/4 v0, 0x2

    goto :goto_0

    .line 144
    :cond_2
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->b:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_3

    .line 145
    const/4 v0, 0x5

    goto :goto_0

    .line 146
    :cond_3
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->g:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_4

    .line 147
    const/16 v0, 0xa

    goto :goto_0

    .line 148
    :cond_4
    instance-of v1, v0, Lcom/facebook/orca/contacts/divebar/ax;

    if-eqz v1, :cond_5

    .line 149
    const/16 v0, 0xb

    goto :goto_0

    .line 150
    :cond_5
    instance-of v1, v0, Lcom/facebook/contacts/picker/ae;

    if-eqz v1, :cond_6

    .line 151
    const/4 v0, 0x3

    goto :goto_0

    .line 152
    :cond_6
    instance-of v1, v0, Lcom/facebook/contacts/picker/af;

    if-eqz v1, :cond_7

    .line 153
    const/4 v0, 0x4

    goto :goto_0

    .line 154
    :cond_7
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->a:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_8

    .line 155
    const/4 v0, 0x0

    goto :goto_0

    .line 156
    :cond_8
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->c:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_9

    .line 157
    const/4 v0, 0x6

    goto :goto_0

    .line 158
    :cond_9
    instance-of v1, v0, Lcom/facebook/orca/contacts/picker/af;

    if-eqz v1, :cond_a

    .line 159
    const/4 v0, 0x7

    goto :goto_0

    .line 160
    :cond_a
    instance-of v1, v0, Lcom/facebook/contacts/picker/t;

    if-eqz v1, :cond_b

    .line 161
    const/16 v0, 0x8

    goto :goto_0

    .line 164
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown object type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    .line 200
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/bc;->g:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ad;

    .line 201
    instance-of v1, v0, Lcom/facebook/contacts/picker/ag;

    if-eqz v1, :cond_0

    .line 202
    check-cast v0, Lcom/facebook/contacts/picker/ag;

    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/contacts/picker/bc;->a(Lcom/facebook/contacts/picker/ag;Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    .line 224
    :goto_0
    return-object v0

    .line 203
    :cond_0
    instance-of v1, v0, Lcom/facebook/orca/contacts/picker/ad;

    if-eqz v1, :cond_1

    .line 204
    check-cast v0, Lcom/facebook/orca/contacts/picker/ad;

    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/contacts/picker/bc;->a(Lcom/facebook/orca/contacts/picker/ad;Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 205
    :cond_1
    instance-of v1, v0, Lcom/facebook/orca/contacts/picker/j;

    if-eqz v1, :cond_2

    .line 206
    check-cast v0, Lcom/facebook/orca/contacts/picker/j;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/picker/bc;->a(Lcom/facebook/orca/contacts/picker/j;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 207
    :cond_2
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->b:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_3

    .line 208
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/contacts/picker/bc;->a(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 209
    :cond_3
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->g:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_4

    .line 210
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/contacts/picker/bc;->b(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 211
    :cond_4
    instance-of v1, v0, Lcom/facebook/orca/contacts/divebar/ax;

    if-eqz v1, :cond_5

    .line 212
    check-cast v0, Lcom/facebook/orca/contacts/divebar/ax;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/picker/bc;->a(Lcom/facebook/orca/contacts/divebar/ax;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 213
    :cond_5
    instance-of v1, v0, Lcom/facebook/contacts/picker/ae;

    if-eqz v1, :cond_6

    .line 214
    check-cast v0, Lcom/facebook/contacts/picker/ae;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/picker/bc;->a(Lcom/facebook/contacts/picker/ae;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 215
    :cond_6
    instance-of v1, v0, Lcom/facebook/contacts/picker/af;

    if-eqz v1, :cond_7

    .line 216
    check-cast v0, Lcom/facebook/contacts/picker/af;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/picker/bc;->a(Lcom/facebook/contacts/picker/af;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 217
    :cond_7
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->a:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_8

    .line 218
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/contacts/picker/bc;->c(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 219
    :cond_8
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->c:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_9

    .line 220
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/contacts/picker/bc;->d(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 221
    :cond_9
    instance-of v1, v0, Lcom/facebook/contacts/picker/t;

    if-eqz v1, :cond_a

    .line 222
    check-cast v0, Lcom/facebook/contacts/picker/t;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/picker/bc;->a(Lcom/facebook/contacts/picker/t;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 223
    :cond_a
    instance-of v1, v0, Lcom/facebook/orca/contacts/picker/af;

    if-eqz v1, :cond_b

    .line 224
    check-cast v0, Lcom/facebook/orca/contacts/picker/af;

    invoke-direct {p0, p2, v0}, Lcom/facebook/orca/contacts/picker/bc;->a(Landroid/view/View;Lcom/facebook/orca/contacts/picker/af;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 226
    :cond_b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown object type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 132
    const/16 v0, 0xc

    return v0
.end method

.method public isEnabled(I)Z
    .locals 1

    .prologue
    .line 191
    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/picker/bc;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 192
    instance-of v0, v0, Lcom/facebook/contacts/picker/ae;

    if-eqz v0, :cond_0

    .line 193
    const/4 v0, 0x0

    .line 195
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

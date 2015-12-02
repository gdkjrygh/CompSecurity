.class public Lcom/facebook/orca/contacts/favorites/aa;
.super Lcom/facebook/contacts/picker/c;
.source "FavoritesEditListAdapter.java"

# interfaces
.implements Lcom/facebook/widget/listview/f;


# static fields
.field private static final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field protected final a:Landroid/content/Context;

.field protected final b:Landroid/view/LayoutInflater;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<+",
            "Lcom/facebook/contacts/picker/u;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;"
        }
    .end annotation
.end field

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

.field private g:Lcom/facebook/contacts/picker/u;

.field private h:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/orca/contacts/favorites/aa;

    sput-object v0, Lcom/facebook/orca/contacts/favorites/aa;->c:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljavax/inject/a;Landroid/view/LayoutInflater;)V
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
            ")V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/facebook/contacts/picker/c;-><init>()V

    .line 43
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->e:Lcom/google/common/a/es;

    .line 44
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    .line 48
    sget-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->h:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->i:I

    .line 62
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/aa;->a:Landroid/content/Context;

    .line 63
    iput-object p2, p0, Lcom/facebook/orca/contacts/favorites/aa;->d:Ljavax/inject/a;

    .line 64
    iput-object p3, p0, Lcom/facebook/orca/contacts/favorites/aa;->b:Landroid/view/LayoutInflater;

    .line 65
    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 197
    check-cast p1, Lcom/facebook/orca/contacts/picker/bb;

    .line 198
    if-nez p1, :cond_0

    .line 199
    new-instance p1, Lcom/facebook/orca/contacts/picker/bb;

    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->a:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/facebook/orca/contacts/picker/bb;-><init>(Landroid/content/Context;)V

    .line 200
    sget-object v0, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p1, v0}, Lcom/facebook/orca/contacts/picker/bb;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 203
    :cond_0
    return-object p1
.end method

.method private a(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/View;
    .locals 1

    .prologue
    .line 187
    if-eqz p2, :cond_0

    .line 191
    :goto_0
    return-object p2

    :cond_0
    new-instance p2, Lcom/facebook/orca/contacts/favorites/aj;

    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/favorites/aj;-><init>(Landroid/content/Context;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/contacts/picker/ae;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 154
    check-cast p2, Lcom/facebook/orca/contacts/picker/ba;

    .line 155
    if-nez p2, :cond_0

    .line 156
    new-instance p2, Lcom/facebook/orca/contacts/picker/ba;

    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/picker/ba;-><init>(Landroid/content/Context;)V

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->h:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/ba;->setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V

    .line 159
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/facebook/orca/contacts/picker/ba;->setText(Ljava/lang/String;)V

    .line 161
    return-object p2
.end method

.method private a(Lcom/facebook/orca/contacts/favorites/c;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 140
    check-cast p2, Lcom/facebook/orca/contacts/favorites/a;

    .line 142
    if-nez p2, :cond_0

    .line 143
    new-instance p2, Lcom/facebook/orca/contacts/favorites/a;

    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/favorites/a;-><init>(Landroid/content/Context;)V

    .line 145
    :cond_0
    invoke-virtual {p2, p1}, Lcom/facebook/orca/contacts/favorites/a;->setContactRow(Lcom/facebook/orca/contacts/favorites/c;)V

    .line 147
    return-object p2
.end method

.method private a(Lcom/facebook/orca/contacts/favorites/g;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 176
    check-cast p2, Lcom/facebook/orca/contacts/favorites/e;

    .line 178
    if-nez p2, :cond_0

    .line 179
    new-instance p2, Lcom/facebook/orca/contacts/favorites/e;

    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/favorites/e;-><init>(Landroid/content/Context;)V

    .line 181
    :cond_0
    invoke-virtual {p2, p1}, Lcom/facebook/orca/contacts/favorites/e;->setGroupRow(Lcom/facebook/orca/contacts/favorites/g;)V

    .line 183
    return-object p2
.end method

.method private a(Lcom/facebook/orca/contacts/favorites/u;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 129
    check-cast p2, Lcom/facebook/orca/contacts/favorites/s;

    .line 131
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/contacts/favorites/s;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 132
    :cond_0
    new-instance p2, Lcom/facebook/orca/contacts/favorites/s;

    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/favorites/s;-><init>(Landroid/content/Context;)V

    .line 134
    :cond_1
    invoke-virtual {p2, p1}, Lcom/facebook/orca/contacts/favorites/s;->setContactRow(Lcom/facebook/orca/contacts/favorites/u;)V

    .line 136
    return-object p2
.end method

.method private a(Lcom/facebook/orca/contacts/favorites/y;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 165
    check-cast p2, Lcom/facebook/orca/contacts/favorites/w;

    .line 167
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/contacts/favorites/w;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 168
    :cond_0
    new-instance p2, Lcom/facebook/orca/contacts/favorites/w;

    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/facebook/orca/contacts/favorites/w;-><init>(Landroid/content/Context;)V

    .line 170
    :cond_1
    invoke-virtual {p2, p1}, Lcom/facebook/orca/contacts/favorites/w;->setGroupRow(Lcom/facebook/orca/contacts/favorites/y;)V

    .line 172
    return-object p2
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/picker/u;
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->g:Lcom/facebook/contacts/picker/u;

    if-nez v0, :cond_0

    .line 268
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/u;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->g:Lcom/facebook/contacts/picker/u;

    .line 269
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->g:Lcom/facebook/contacts/picker/u;

    invoke-interface {v0, p0}, Lcom/facebook/contacts/picker/u;->a(Lcom/facebook/contacts/picker/w;)V

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->g:Lcom/facebook/contacts/picker/u;

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V
    .locals 0

    .prologue
    .line 286
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/aa;->h:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    .line 288
    return-void
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 3
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
    .line 69
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/aa;->e:Lcom/google/common/a/es;

    .line 70
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->e:Lcom/google/common/a/es;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    .line 71
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/aa;->notifyDataSetChanged()V

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->i:I

    .line 74
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ad;

    .line 75
    instance-of v2, v0, Lcom/facebook/orca/contacts/favorites/u;

    if-nez v2, :cond_1

    instance-of v0, v0, Lcom/facebook/orca/contacts/favorites/y;

    if-eqz v0, :cond_0

    .line 76
    :cond_1
    iget v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->i:I

    goto :goto_0

    .line 79
    :cond_2
    return-void
.end method

.method public a(Ljava/lang/CharSequence;Lcom/facebook/contacts/picker/l;)V
    .locals 2

    .prologue
    .line 250
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    sget-object v0, Lcom/facebook/orca/contacts/favorites/ab;->a:[I

    invoke-virtual {p2}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/m;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 260
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/aa;->b(Lcom/google/common/a/es;)V

    .line 263
    :goto_0
    return-void

    .line 253
    :pswitch_0
    invoke-virtual {p2}, Lcom/facebook/contacts/picker/l;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/favorites/aa;->b(Lcom/google/common/a/es;)V

    goto :goto_0

    .line 256
    :pswitch_1
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/aa;->b()V

    goto :goto_0

    .line 251
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b()V
    .locals 1

    .prologue
    .line 276
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->e:Lcom/google/common/a/es;

    iput-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    .line 277
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 278
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/aa;->notifyDataSetChanged()V

    .line 282
    :goto_0
    return-void

    .line 280
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/aa;->notifyDataSetInvalidated()V

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
    .line 230
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    .line 231
    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 232
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/aa;->notifyDataSetChanged()V

    .line 236
    :goto_0
    return-void

    .line 234
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/aa;->notifyDataSetInvalidated()V

    goto :goto_0
.end method

.method public synthetic c()Lcom/facebook/widget/a/f;
    .locals 1

    .prologue
    .line 26
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/favorites/aa;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 240
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    invoke-virtual {v1, v0}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/contacts/picker/ar;->f:Lcom/facebook/contacts/picker/ad;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 245
    iget v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->i:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 125
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 4

    .prologue
    .line 93
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ad;

    .line 94
    instance-of v1, v0, Lcom/facebook/orca/contacts/favorites/u;

    if-eqz v1, :cond_0

    .line 95
    const/4 v0, 0x0

    .line 107
    :goto_0
    return v0

    .line 96
    :cond_0
    instance-of v1, v0, Lcom/facebook/orca/contacts/favorites/y;

    if-eqz v1, :cond_1

    .line 97
    const/4 v0, 0x4

    goto :goto_0

    .line 98
    :cond_1
    instance-of v1, v0, Lcom/facebook/orca/contacts/favorites/c;

    if-eqz v1, :cond_2

    .line 99
    const/4 v0, 0x1

    goto :goto_0

    .line 100
    :cond_2
    instance-of v1, v0, Lcom/facebook/orca/contacts/favorites/g;

    if-eqz v1, :cond_3

    .line 101
    const/4 v0, 0x5

    goto :goto_0

    .line 102
    :cond_3
    instance-of v1, v0, Lcom/facebook/contacts/picker/ae;

    if-eqz v1, :cond_4

    .line 103
    const/4 v0, 0x6

    goto :goto_0

    .line 104
    :cond_4
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->e:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_5

    .line 105
    const/4 v0, 0x3

    goto :goto_0

    .line 106
    :cond_5
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->f:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_6

    .line 107
    const/4 v0, 0x2

    goto :goto_0

    .line 109
    :cond_6
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
    .line 208
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/aa;->f:Lcom/google/common/a/es;

    invoke-virtual {v0, p1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ad;

    .line 210
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->f:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_0

    .line 211
    invoke-direct {p0, p3, p2}, Lcom/facebook/orca/contacts/favorites/aa;->a(Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    .line 223
    :goto_0
    return-object v0

    .line 212
    :cond_0
    instance-of v1, v0, Lcom/facebook/orca/contacts/favorites/u;

    if-eqz v1, :cond_1

    .line 213
    check-cast v0, Lcom/facebook/orca/contacts/favorites/u;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/favorites/aa;->a(Lcom/facebook/orca/contacts/favorites/u;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 214
    :cond_1
    instance-of v1, v0, Lcom/facebook/orca/contacts/favorites/c;

    if-eqz v1, :cond_2

    .line 215
    check-cast v0, Lcom/facebook/orca/contacts/favorites/c;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/favorites/aa;->a(Lcom/facebook/orca/contacts/favorites/c;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 216
    :cond_2
    instance-of v1, v0, Lcom/facebook/contacts/picker/ae;

    if-eqz v1, :cond_3

    .line 217
    check-cast v0, Lcom/facebook/contacts/picker/ae;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/favorites/aa;->a(Lcom/facebook/contacts/picker/ae;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 218
    :cond_3
    instance-of v1, v0, Lcom/facebook/orca/contacts/favorites/y;

    if-eqz v1, :cond_4

    .line 219
    check-cast v0, Lcom/facebook/orca/contacts/favorites/y;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/favorites/aa;->a(Lcom/facebook/orca/contacts/favorites/y;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 220
    :cond_4
    instance-of v1, v0, Lcom/facebook/orca/contacts/favorites/g;

    if-eqz v1, :cond_5

    .line 221
    check-cast v0, Lcom/facebook/orca/contacts/favorites/g;

    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/orca/contacts/favorites/aa;->a(Lcom/facebook/orca/contacts/favorites/g;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 222
    :cond_5
    sget-object v1, Lcom/facebook/orca/contacts/picker/ar;->e:Lcom/facebook/contacts/picker/ad;

    if-ne v0, v1, :cond_6

    .line 223
    invoke-direct {p0, p2, p3}, Lcom/facebook/orca/contacts/favorites/aa;->a(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    .line 225
    :cond_6
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
    .line 87
    const/4 v0, 0x7

    return v0
.end method

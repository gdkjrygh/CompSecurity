.class public Lcom/qihoo/security/opti/trashclear/filemanager/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field static final synthetic a:Z


# instance fields
.field private b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/security/opti/trashclear/filemanager/d;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/view/View;

.field private e:Landroid/content/Context;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private k:[Ljava/lang/String;

.field private l:Landroid/view/View$OnClickListener;

.field private m:Landroid/widget/ListView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/qihoo/security/opti/trashclear/filemanager/a;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/f;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->c:Ljava/util/ArrayList;

    .line 38
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->h:Ljava/lang/String;

    .line 42
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->j:Ljava/util/HashSet;

    .line 44
    iput-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->k:[Ljava/lang/String;

    .line 71
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a$1;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/a;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->l:Landroid/view/View$OnClickListener;

    .line 47
    sget-boolean v0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 48
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/f;->p()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->e:Landroid/content/Context;

    .line 50
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f()V

    .line 51
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/filemanager/a;)Lcom/qihoo/security/opti/trashclear/filemanager/f;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/filemanager/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    return-object p1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 240
    const-string/jumbo v0, "/"

    .line 241
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Lcom/qihoo/security/opti/trashclear/filemanager/d;)V
    .locals 3

    .prologue
    .line 284
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->e:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/h;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    :goto_0
    return-void

    .line 285
    :catch_0
    move-exception v0

    .line 286
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->e:Landroid/content/Context;

    const v1, 0x7f0c0076

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;II)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/filemanager/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/opti/trashclear/filemanager/a;)Landroid/view/View;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->d:Landroid/view/View;

    return-object v0
.end method

.method private f()V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->g()V

    .line 63
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->i()V

    .line 64
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

    const v1, 0x7f0b0201

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/f;->d(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->d:Landroid/view/View;

    .line 69
    return-void
.end method

.method private h()V
    .locals 0

    .prologue
    .line 146
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a()V

    .line 147
    return-void
.end method

.method private i()V
    .locals 2

    .prologue
    .line 161
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

    const v1, 0x7f0b0203

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/f;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->m:Landroid/widget/ListView;

    .line 162
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->m:Landroid/widget/ListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setLongClickable(Z)V

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->m:Landroid/widget/ListView;

    new-instance v1, Lcom/qihoo/security/opti/trashclear/filemanager/a$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a$3;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 169
    return-void
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/opti/trashclear/filemanager/d;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

    invoke-interface {v0, p1}, Lcom/qihoo/security/opti/trashclear/filemanager/f;->e(I)Lcom/qihoo/security/opti/trashclear/filemanager/d;

    move-result-object v0

    return-object v0
.end method

.method protected a()V
    .locals 8

    .prologue
    const/4 v7, -0x1

    .line 86
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->d:Landroid/view/View;

    const v1, 0x7f0b0202

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 87
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 88
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    .line 89
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->g:Ljava/lang/String;

    const-string/jumbo v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    move v3, v1

    .line 91
    :goto_0
    if-eq v3, v7, :cond_0

    .line 92
    const-string/jumbo v1, "/"

    invoke-virtual {v4, v1, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    .line 93
    if-ne v1, v7, :cond_1

    .line 94
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v3, v1, :cond_0

    .line 95
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    move v2, v1

    .line 101
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->e:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v5, 0x7f03009a

    const/4 v6, 0x0

    invoke-virtual {v1, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 104
    const v1, 0x7f0b0207

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 105
    invoke-virtual {v4, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 106
    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 108
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->l:Landroid/view/View$OnClickListener;

    invoke-virtual {v5, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    const/4 v1, 0x0

    invoke-virtual {v4, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 110
    add-int/lit8 v1, v2, 0x1

    .line 111
    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    move v3, v1

    .line 112
    goto :goto_0

    .line 114
    :cond_0
    new-instance v1, Lcom/qihoo/security/opti/trashclear/filemanager/a$2;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a$2;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/a;Landroid/widget/LinearLayout;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/LinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 125
    return-void

    :cond_1
    move v2, v1

    goto :goto_1
.end method

.method public a(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 172
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

    invoke-interface {v0, p3}, Lcom/qihoo/security/opti/trashclear/filemanager/f;->e(I)Lcom/qihoo/security/opti/trashclear/filemanager/d;

    move-result-object v0

    .line 174
    if-nez v0, :cond_0

    .line 186
    :goto_0
    return-void

    .line 178
    :cond_0
    iget-boolean v1, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    if-nez v1, :cond_1

    .line 179
    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a(Lcom/qihoo/security/opti/trashclear/filemanager/d;)V

    goto :goto_0

    .line 183
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->a:Ljava/lang/String;

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    .line 184
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->m:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEnabled(Z)V

    .line 185
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->c()V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->g:Ljava/lang/String;

    .line 190
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    .line 191
    return-void
.end method

.method public a([Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 218
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->j:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 219
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 220
    array-length v1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p1, v0

    .line 221
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->i:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 222
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 223
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->j:Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 220
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 226
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    .line 203
    return-void
.end method

.method public b([Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 229
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 230
    array-length v0, p1

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->k:[Ljava/lang/String;

    .line 231
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 232
    aget-object v1, p1, v0

    .line 233
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 234
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->k:[Ljava/lang/String;

    aput-object v1, v2, v0

    .line 231
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 237
    :cond_0
    return-void
.end method

.method public b()Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 129
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 130
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    .line 131
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->c()V

    .line 135
    :goto_0
    return v2

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/f;->finish()V

    goto :goto_0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 140
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->h()V

    .line 142
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b:Lcom/qihoo/security/opti/trashclear/filemanager/f;

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/qihoo/security/opti/trashclear/filemanager/f;->c(Ljava/lang/String;)V

    .line 143
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->h:Ljava/lang/String;

    .line 211
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->i:Ljava/lang/String;

    .line 215
    return-void
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 291
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 292
    const/4 v0, 0x0

    .line 294
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public e(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 245
    if-nez p1, :cond_1

    .line 248
    :cond_0
    :goto_0
    return v0

    .line 246
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->i:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 247
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->j:Ljava/util/HashSet;

    if-eqz v1, :cond_0

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->j:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public f(Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 252
    if-nez p1, :cond_1

    .line 266
    :cond_0
    :goto_0
    return v0

    .line 255
    :cond_1
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->i:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 258
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->k:[Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 261
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/a;->k:[Ljava/lang/String;

    array-length v4, v3

    move v2, v1

    :goto_1
    if-ge v2, v4, :cond_2

    aget-object v5, v3, v2

    .line 262
    invoke-virtual {v5, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 261
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    move v0, v1

    .line 266
    goto :goto_0
.end method

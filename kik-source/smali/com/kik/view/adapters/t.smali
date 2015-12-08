.class public final Lcom/kik/view/adapters/t;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/t$a;
    }
.end annotation


# static fields
.field private static final i:Lorg/c/b;


# instance fields
.field a:Z

.field private final b:Landroid/view/LayoutInflater;

.field private c:Ljava/util/List;

.field private d:Z

.field private e:Z

.field private final f:Lcom/kik/cache/ad;

.field private final g:Lcom/kik/android/a;

.field private h:Z

.field private final j:Lkik/a/e/r;

.field private final k:Lkik/a/e/l;

.field private l:Lkik/a/e/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 56
    const-string v0, "ConversationsAdapter"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/view/adapters/t;->i:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lcom/kik/cache/ad;Lkik/a/e/r;Lkik/a/e/l;Lkik/a/e/n;Lcom/kik/android/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 49
    iput-boolean v1, p0, Lcom/kik/view/adapters/t;->a:Z

    .line 51
    iput-boolean v1, p0, Lcom/kik/view/adapters/t;->d:Z

    .line 52
    iput-boolean v0, p0, Lcom/kik/view/adapters/t;->e:Z

    .line 55
    iput-boolean v0, p0, Lcom/kik/view/adapters/t;->h:Z

    .line 69
    iput-object p2, p0, Lcom/kik/view/adapters/t;->c:Ljava/util/List;

    .line 70
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/view/adapters/t;->b:Landroid/view/LayoutInflater;

    .line 71
    iput-object p3, p0, Lcom/kik/view/adapters/t;->f:Lcom/kik/cache/ad;

    .line 72
    iput-object p4, p0, Lcom/kik/view/adapters/t;->j:Lkik/a/e/r;

    .line 73
    iput-object p5, p0, Lcom/kik/view/adapters/t;->k:Lkik/a/e/l;

    .line 74
    iput-object p6, p0, Lcom/kik/view/adapters/t;->l:Lkik/a/e/n;

    .line 75
    iput-object p7, p0, Lcom/kik/view/adapters/t;->g:Lcom/kik/android/a;

    .line 76
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lcom/kik/cache/ad;Lkik/a/e/r;Lkik/a/e/l;Lkik/a/e/n;Lcom/kik/android/a;B)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 80
    invoke-direct {p0, p1, v1, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 49
    iput-boolean v0, p0, Lcom/kik/view/adapters/t;->a:Z

    .line 51
    iput-boolean v0, p0, Lcom/kik/view/adapters/t;->d:Z

    .line 52
    iput-boolean v1, p0, Lcom/kik/view/adapters/t;->e:Z

    .line 55
    iput-boolean v1, p0, Lcom/kik/view/adapters/t;->h:Z

    .line 81
    iput-object p2, p0, Lcom/kik/view/adapters/t;->c:Ljava/util/List;

    .line 82
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/view/adapters/t;->b:Landroid/view/LayoutInflater;

    .line 83
    iput-boolean v1, p0, Lcom/kik/view/adapters/t;->d:Z

    .line 84
    iput-object p3, p0, Lcom/kik/view/adapters/t;->f:Lcom/kik/cache/ad;

    .line 85
    iput-object p4, p0, Lcom/kik/view/adapters/t;->j:Lkik/a/e/r;

    .line 86
    iput-object p5, p0, Lcom/kik/view/adapters/t;->k:Lkik/a/e/l;

    .line 87
    iput-object p6, p0, Lcom/kik/view/adapters/t;->l:Lkik/a/e/n;

    .line 88
    iput-object p7, p0, Lcom/kik/view/adapters/t;->g:Lcom/kik/android/a;

    .line 89
    return-void
.end method

.method private a(I)Lkik/a/d/f;
    .locals 1

    .prologue
    .line 353
    iget-object v0, p0, Lcom/kik/view/adapters/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    iget-object v0, p0, Lcom/kik/view/adapters/t;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/f;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/view/adapters/t;->e:Z

    .line 64
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 370
    iput-object p1, p0, Lcom/kik/view/adapters/t;->c:Ljava/util/List;

    .line 371
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/view/adapters/t;->h:Z

    .line 94
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 375
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/view/adapters/t;->a:Z

    .line 376
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 365
    iget-object v0, p0, Lcom/kik/view/adapters/t;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/kik/view/adapters/t;->a(I)Lkik/a/d/f;

    move-result-object v0

    return-object v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 15

    .prologue
    .line 102
    if-nez p2, :cond_3

    .line 110
    iget-object v2, p0, Lcom/kik/view/adapters/t;->b:Landroid/view/LayoutInflater;

    const v3, 0x7f030070

    const/4 v4, 0x0

    move-object/from16 v0, p3

    invoke-virtual {v2, v3, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 111
    new-instance v3, Lcom/kik/view/adapters/t$a;

    const/4 v2, 0x0

    invoke-direct {v3, v2}, Lcom/kik/view/adapters/t$a;-><init>(B)V

    .line 112
    const v2, 0x7f0e016e

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/kik/cache/ContactImageView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->f:Lcom/kik/cache/ContactImageView;

    .line 113
    const v2, 0x7f0e0170

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->g:Landroid/widget/ImageView;

    .line 114
    const v2, 0x7f0e0175

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    .line 115
    const v2, 0x7f0e0173

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->e:Landroid/widget/TextView;

    .line 116
    const v2, 0x7f0e0177

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    .line 117
    const v2, 0x7f0e0171

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->h:Landroid/widget/TextView;

    .line 118
    const v2, 0x7f0e016f

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->b:Landroid/widget/ImageView;

    .line 119
    const v2, 0x7f0e0176

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lkik/android/widget/IconImageView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    .line 120
    const v2, 0x7f0e0174

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->i:Landroid/widget/TextView;

    .line 121
    const v2, 0x7f0e0178

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, v3, Lcom/kik/view/adapters/t$a;->j:Landroid/widget/ImageView;

    .line 122
    iget-object v2, v3, Lcom/kik/view/adapters/t$a;->j:Landroid/widget/ImageView;

    const-string v4, "AUTOMATION_MUTED_ICON"

    invoke-static {v2, v4}, Lcom/kik/m/d;->a(Landroid/view/View;Ljava/lang/String;)V

    .line 123
    move-object/from16 v0, p2

    invoke-virtual {v0, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v11, v3

    .line 132
    :goto_0
    invoke-direct/range {p0 .. p1}, Lcom/kik/view/adapters/t;->a(I)Lkik/a/d/f;

    move-result-object v12

    .line 134
    iget-object v2, p0, Lcom/kik/view/adapters/t;->k:Lkik/a/e/l;

    invoke-virtual {v12}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v10

    .line 135
    if-nez v10, :cond_0

    .line 136
    iget-object v2, p0, Lcom/kik/view/adapters/t;->j:Lkik/a/e/r;

    invoke-virtual {v12}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v10

    .line 138
    :cond_0
    invoke-virtual {v12}, Lkik/a/d/f;->n()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 139
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->j:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 145
    :goto_1
    invoke-virtual {v12}, Lkik/a/d/f;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 146
    iget-object v2, p0, Lcom/kik/view/adapters/t;->j:Lkik/a/e/r;

    invoke-virtual {v12}, Lkik/a/d/f;->h()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v2

    .line 147
    invoke-static {v2}, Lkik/android/util/cq;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v2

    .line 148
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f090142

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 149
    iget-object v4, v11, Lcom/kik/view/adapters/t$a;->e:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    :goto_2
    instance-of v2, v10, Lkik/a/d/n;

    if-nez v2, :cond_1

    .line 169
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->f:Lcom/kik/cache/ContactImageView;

    const v3, 0x7f020305

    invoke-virtual {v2, v3}, Lcom/kik/cache/ContactImageView;->e(I)V

    .line 172
    :cond_1
    invoke-virtual {v12}, Lkik/a/d/f;->e()Lkik/a/d/s;

    move-result-object v13

    .line 174
    if-eqz v13, :cond_19

    .line 175
    iget-object v2, p0, Lcom/kik/view/adapters/t;->j:Lkik/a/e/r;

    invoke-virtual {v13}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v6

    .line 177
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->h:Landroid/widget/TextView;

    invoke-virtual {v13}, Lkik/a/d/s;->e()J

    move-result-wide v4

    const/4 v3, 0x1

    invoke-static {v4, v5, v3}, Lkik/android/util/cq;->a(JZ)Lkik/android/util/cq$a;

    move-result-object v3

    iget-object v3, v3, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    const-class v2, Lkik/a/d/a/a;

    invoke-static {v13, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v2

    check-cast v2, Lkik/a/d/a/a;

    .line 180
    const-class v3, Lkik/a/d/a/l;

    invoke-static {v13, v3}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v3

    check-cast v3, Lkik/a/d/a/l;

    .line 181
    const-class v4, Lkik/a/d/a/m;

    invoke-static {v13, v4}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v4

    check-cast v4, Lkik/a/d/a/m;

    .line 182
    const-class v5, Lkik/a/d/a/d;

    invoke-static {v13, v5}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v5

    check-cast v5, Lkik/a/d/a/d;

    .line 184
    const-string v8, "     "

    .line 186
    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lkik/a/d/k;->m()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 187
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x7f090056

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lkik/android/widget/IconImageView;->setVisibility(I)V

    .line 297
    :goto_3
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->b:Landroid/widget/ImageView;

    if-eqz v2, :cond_2

    .line 298
    iget-object v2, p0, Lcom/kik/view/adapters/t;->j:Lkik/a/e/r;

    invoke-virtual {v12, v2}, Lkik/a/d/f;->a(Lkik/a/e/r;)Z

    move-result v2

    if-eqz v2, :cond_1a

    iget-boolean v2, p0, Lcom/kik/view/adapters/t;->d:Z

    if-eqz v2, :cond_1a

    .line 299
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->b:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 306
    :cond_2
    :goto_4
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->f:Lcom/kik/cache/ContactImageView;

    iget-object v4, p0, Lcom/kik/view/adapters/t;->f:Lcom/kik/cache/ad;

    iget-boolean v5, p0, Lcom/kik/view/adapters/t;->e:Z

    iget-boolean v6, p0, Lcom/kik/view/adapters/t;->h:Z

    const/4 v7, 0x0

    iget-object v8, p0, Lcom/kik/view/adapters/t;->j:Lkik/a/e/r;

    iget-object v9, p0, Lcom/kik/view/adapters/t;->g:Lcom/kik/android/a;

    move-object v3, v10

    invoke-virtual/range {v2 .. v9}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZZZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 308
    iget-object v3, v11, Lcom/kik/view/adapters/t$a;->g:Landroid/widget/ImageView;

    instance-of v2, v10, Lkik/a/d/n;

    if-nez v2, :cond_1b

    invoke-virtual {v10}, Lkik/a/d/k;->i()Z

    move-result v2

    if-eqz v2, :cond_1b

    const/4 v2, 0x0

    :goto_5
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 310
    if-nez v13, :cond_1c

    .line 312
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 347
    :goto_6
    return-object p2

    .line 128
    :cond_3
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kik/view/adapters/t$a;

    move-object v11, v2

    goto/16 :goto_0

    .line 142
    :cond_4
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->j:Landroid/widget/ImageView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 153
    :cond_5
    instance-of v2, v10, Lkik/a/d/n;

    if-eqz v2, :cond_7

    invoke-virtual {v10}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_7

    move-object v2, v10

    .line 154
    check-cast v2, Lkik/a/d/n;

    iget-object v3, p0, Lcom/kik/view/adapters/t;->j:Lkik/a/e/r;

    invoke-static {v2, v3}, Lkik/android/util/cq;->a(Lkik/a/d/n;Lkik/a/e/r;)Ljava/lang/String;

    move-result-object v2

    .line 162
    :cond_6
    :goto_7
    iget-object v3, v11, Lcom/kik/view/adapters/t$a;->e:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->i:Landroid/widget/TextView;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 158
    :cond_7
    invoke-virtual {v10}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v2

    .line 159
    if-nez v2, :cond_6

    .line 160
    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f090202

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    .line 191
    :cond_8
    if-eqz v2, :cond_d

    .line 192
    iget-object v3, v11, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    const-string v4, ""

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    const-string v3, "png-preview"

    invoke-virtual {v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v3

    if-eqz v3, :cond_9

    const/4 v3, 0x1

    .line 195
    :goto_8
    if-eqz v3, :cond_b

    .line 197
    const-string v3, "png-preview"

    invoke-virtual {v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    .line 198
    const/4 v3, 0x0

    .line 199
    instance-of v4, v2, Lkik/a/d/d;

    if-eqz v4, :cond_20

    .line 200
    check-cast v2, Lkik/a/d/d;

    invoke-virtual {v2}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v2

    .line 202
    :goto_9
    iget-object v3, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    iget-object v4, p0, Lcom/kik/view/adapters/t;->l:Lkik/a/e/n;

    invoke-virtual {v3, v2, v4}, Lkik/android/widget/IconImageView;->a(Ljava/lang/String;Lkik/a/e/n;)V

    .line 203
    if-eqz v2, :cond_a

    const/4 v2, 0x1

    .line 209
    :goto_a
    if-eqz v2, :cond_c

    .line 210
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lkik/android/widget/IconImageView;->setVisibility(I)V

    goto/16 :goto_3

    .line 193
    :cond_9
    const/4 v3, 0x0

    goto :goto_8

    .line 203
    :cond_a
    const/4 v2, 0x0

    goto :goto_a

    .line 206
    :cond_b
    iget-object v3, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    iget-object v4, p0, Lcom/kik/view/adapters/t;->l:Lkik/a/e/n;

    invoke-virtual {v3, v2, v4}, Lkik/android/widget/IconImageView;->a(Lkik/a/d/a/a;Lkik/a/e/n;)Z

    move-result v2

    goto :goto_a

    .line 213
    :cond_c
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lkik/android/widget/IconImageView;->setVisibility(I)V

    goto/16 :goto_3

    .line 216
    :cond_d
    if-eqz v3, :cond_10

    .line 217
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v3}, Lkik/a/d/a/l;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    invoke-virtual {v3}, Lkik/a/d/a/l;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_f

    .line 220
    iget-object v3, v11, Lcom/kik/view/adapters/t$a;->g:Landroid/widget/ImageView;

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Lkik/a/d/k;->i()Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    :goto_b
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3

    :cond_e
    const/16 v2, 0x8

    goto :goto_b

    .line 223
    :cond_f
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->g:Landroid/widget/ImageView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3

    .line 226
    :cond_10
    if-eqz v4, :cond_11

    .line 227
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v4}, Lkik/a/d/a/m;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 229
    :cond_11
    if-eqz v5, :cond_12

    invoke-virtual {v5}, Lkik/a/d/a/d;->g()Z

    move-result v2

    if-eqz v2, :cond_12

    .line 230
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v5}, Lkik/a/d/a/d;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    const/4 v2, 0x1

    new-array v2, v2, [Landroid/view/View;

    const/4 v3, 0x0

    iget-object v4, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    aput-object v4, v2, v3

    invoke-static {v2}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto/16 :goto_3

    .line 234
    :cond_12
    const/4 v3, 0x0

    .line 235
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lkik/android/widget/IconImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 236
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Lkik/android/widget/IconImageView;->setVisibility(I)V

    .line 237
    invoke-virtual {v13}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v4

    .line 239
    const/4 v5, -0x1

    .line 241
    const-class v2, Lkik/a/d/a/b;

    invoke-static {v13, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v2

    check-cast v2, Lkik/a/d/a/b;

    .line 243
    if-eqz v2, :cond_1f

    .line 246
    invoke-virtual {v2}, Lkik/a/d/a/b;->a()I

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_13

    .line 247
    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v2

    const v4, 0x7f09015e

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 256
    :goto_c
    if-eqz v2, :cond_18

    .line 257
    const/4 v4, 0x0

    move v14, v4

    move v4, v5

    move v5, v14

    :goto_d
    const/16 v6, 0xa

    if-ge v5, v6, :cond_14

    .line 258
    const/16 v6, 0x20

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v2, v6, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 259
    const/4 v6, -0x1

    if-eq v4, v6, :cond_14

    .line 260
    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    .line 250
    :cond_13
    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v4

    const v6, 0x7f09015d

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v2}, Lkik/a/d/a/b;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v7, v9

    invoke-virtual {v4, v6, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_c

    .line 263
    :cond_14
    const/4 v5, -0x1

    if-eq v4, v5, :cond_15

    .line 264
    const/4 v3, 0x1

    .line 265
    const/4 v5, 0x0

    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 267
    :cond_15
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0x3c

    if-le v4, v5, :cond_1e

    .line 268
    const/4 v4, 0x1

    .line 269
    const/4 v3, 0x0

    const/16 v5, 0x3c

    invoke-virtual {v2, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    move v2, v4

    .line 271
    :goto_e
    if-eqz v2, :cond_16

    .line 272
    const-string v2, "..."

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 279
    :cond_16
    :goto_f
    const/4 v4, 0x0

    .line 280
    const-class v2, Lkik/a/f/e/k;

    invoke-static {v13, v2}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v2

    check-cast v2, Lkik/a/f/e/k;

    .line 281
    if-eqz v2, :cond_17

    .line 282
    invoke-virtual {v2}, Lkik/a/f/e/k;->b()Lcom/kik/i/a/a/c;

    move-result-object v4

    .line 284
    :cond_17
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v5, v11, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getLineHeight()I

    move-result v5

    invoke-static {v5}, Lkik/android/chat/KikApplication;->b(I)I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lcom/kik/android/c/f;->a(Landroid/content/Context;Ljava/lang/CharSequence;Lcom/kik/i/a/a/c;IZLkik/android/e/f;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 285
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v8}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v3, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 287
    iget-object v3, v11, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 276
    :cond_18
    const-string v3, ""

    goto :goto_f

    .line 292
    :cond_19
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->h:Landroid/widget/TextView;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->d:Landroid/widget/TextView;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 294
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lkik/android/widget/IconImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 295
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->c:Lkik/android/widget/IconImageView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lkik/android/widget/IconImageView;->setVisibility(I)V

    goto/16 :goto_3

    .line 302
    :cond_1a
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->b:Landroid/widget/ImageView;

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_4

    .line 308
    :cond_1b
    const/16 v2, 0x8

    goto/16 :goto_5

    .line 314
    :cond_1c
    invoke-virtual {v13}, Lkik/a/d/s;->d()Z

    move-result v2

    if-nez v2, :cond_1d

    .line 316
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 317
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    const v3, 0x7f070057

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_6

    .line 321
    :cond_1d
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 322
    invoke-virtual {v12}, Lkik/a/d/f;->d()Lkik/a/d/s;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/s;->c()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    .line 342
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f070039

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_6

    .line 324
    :sswitch_0
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07003d

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_6

    .line 327
    :sswitch_1
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07003c

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_6

    .line 330
    :sswitch_2
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07003b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_6

    .line 333
    :sswitch_3
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f070038

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_6

    .line 336
    :sswitch_4
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07003a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_6

    .line 339
    :sswitch_5
    iget-object v2, v11, Lcom/kik/view/adapters/t$a;->a:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/kik/view/adapters/t;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07003a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_6

    :cond_1e
    move-object v14, v2

    move v2, v3

    move-object v3, v14

    goto/16 :goto_e

    :cond_1f
    move-object v2, v4

    goto/16 :goto_c

    :cond_20
    move-object v2, v3

    goto/16 :goto_9

    .line 322
    :sswitch_data_0
    .sparse-switch
        -0x64 -> :sswitch_5
        0xc8 -> :sswitch_0
        0x12c -> :sswitch_2
        0x190 -> :sswitch_3
        0x1f4 -> :sswitch_1
        0x258 -> :sswitch_4
    .end sparse-switch
.end method

.method public final hasStableIds()Z
    .locals 1

    .prologue
    .line 359
    const/4 v0, 0x1

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .prologue
    .line 382
    invoke-super {p0}, Landroid/widget/ArrayAdapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/kik/view/adapters/t;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

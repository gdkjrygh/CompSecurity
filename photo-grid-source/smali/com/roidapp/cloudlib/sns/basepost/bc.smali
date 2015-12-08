.class public final Lcom/roidapp/cloudlib/sns/basepost/bc;
.super Landroid/support/v7/widget/al;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/bumptech/glide/k;
.implements Lcom/bumptech/glide/l;
.implements Lcom/roidapp/cloudlib/sns/basepost/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/al",
        "<",
        "Landroid/support/v7/widget/bi;",
        ">;",
        "Landroid/view/View$OnClickListener;",
        "Lcom/bumptech/glide/k",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/n;",
        ">;",
        "Lcom/bumptech/glide/l",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/n;",
        ">;",
        "Lcom/roidapp/cloudlib/sns/basepost/b;"
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private final D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation
.end field

.field private E:I

.field private F:Z

.field private a:Landroid/content/Context;

.field private b:Landroid/support/v4/app/Fragment;

.field private c:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private f:I

.field private g:Lcom/roidapp/baselib/view/r;

.field private h:Lcom/roidapp/cloudlib/sns/b/p;

.field private i:Lcom/roidapp/cloudlib/sns/b/x;

.field private j:Z

.field private k:Lcom/roidapp/cloudlib/sns/basepost/u;

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:Landroid/text/TextPaint;

.field private v:I

.field private w:J

.field private x:Ljava/util/regex/Pattern;

.field private y:Lcom/roidapp/cloudlib/sns/b/m;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/support/v4/app/Fragment;Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;ZZZLcom/roidapp/cloudlib/sns/basepost/u;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 110
    invoke-direct {p0}, Landroid/support/v7/widget/al;-><init>()V

    .line 75
    iput v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->f:I

    .line 87
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->v:I

    .line 88
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->w:J

    .line 89
    const-string v0, "[#|@]\\w+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->x:Ljava/util/regex/Pattern;

    .line 95
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->C:Z

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->D:Ljava/util/List;

    .line 111
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    .line 112
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    .line 113
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->c:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    .line 114
    iput-boolean p3, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->z:Z

    .line 115
    iput-boolean p4, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->A:Z

    .line 116
    iput-boolean p5, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->B:Z

    .line 117
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->e:I

    .line 118
    iput-object p6, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    .line 2130
    const-string v0, "#bdbdbd"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->m:I

    .line 2131
    const-string v0, "#a0a0a0"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->n:I

    .line 2132
    const-string v0, "#00ca72"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->o:I

    .line 2133
    const-string v0, "#00844a"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->p:I

    .line 2134
    const-string v0, "#384248"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->q:I

    .line 2135
    const-string v0, "#7f878c"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->r:I

    .line 2136
    const-string v0, "#1de9b6"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->s:I

    .line 2137
    const-string v0, "#19cea1"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->t:I

    .line 2140
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->u:Landroid/text/TextPaint;

    .line 2141
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->u:Landroid/text/TextPaint;

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 2142
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->u:Landroid/text/TextPaint;

    const-string v1, "#384248"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 2144
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->u:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/ap;->k:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 2146
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->e:I

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    float-to-int v1, v1

    mul-int/lit8 v1, v1, 0x14

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->l:I

    .line 2148
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/bd;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/basepost/bd;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->y:Lcom/roidapp/cloudlib/sns/b/m;

    .line 122
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/bc;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    return-object v0
.end method

.method private a(IZ)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 666
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 667
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-static {v1, v2}, Lcom/roidapp/cloudlib/sns/g/f;->b(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;

    move-result-object v1

    .line 670
    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->f:Lcom/roidapp/cloudlib/sns/b/g;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/g/a;->a(Lcom/roidapp/cloudlib/sns/g/a;Lcom/roidapp/cloudlib/sns/b/g;)Lcom/roidapp/cloudlib/sns/b/g;

    move-result-object v0

    .line 679
    sget-object v1, Lcom/roidapp/cloudlib/sns/basepost/bi;->b:[I

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/g;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 704
    :goto_0
    return-void

    .line 681
    :pswitch_0
    if-eqz p2, :cond_0

    .line 682
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Like/DoubleClick"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 683
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Like/DoubleClick"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 3754
    :goto_1
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 3755
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    .line 3756
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/sns/g/b;->c(Lcom/roidapp/cloudlib/sns/b/n;)V

    .line 3759
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget v1, v1, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    new-instance v3, Lcom/roidapp/cloudlib/sns/basepost/bp;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bp;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;Lcom/roidapp/cloudlib/sns/b/n;)V

    invoke-static {v2, v4, v5, v1, v3}, Lcom/roidapp/cloudlib/sns/q;->h(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 685
    :cond_0
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Like/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Like/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_1

    .line 691
    :pswitch_1
    if-eqz p2, :cond_1

    .line 692
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/UnLike/DoubleClick"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 693
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/UnLike/DoubleClick"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 4709
    :goto_2
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 4710
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    .line 4711
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/sns/g/b;->c(Lcom/roidapp/cloudlib/sns/b/n;)V

    .line 4713
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget v1, v1, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    new-instance v3, Lcom/roidapp/cloudlib/sns/basepost/bo;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bo;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;Lcom/roidapp/cloudlib/sns/b/n;)V

    invoke-static {v2, v4, v5, v1, v3}, Lcom/roidapp/cloudlib/sns/q;->g(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 695
    :cond_1
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/UnLike/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 696
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/UnLike/Click"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_2

    .line 679
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;ILcom/roidapp/cloudlib/sns/b/x;JZII)V
    .locals 11

    .prologue
    .line 277
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v9

    .line 278
    invoke-virtual {p1, p2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 279
    if-eqz p7, :cond_0

    .line 280
    new-instance v2, Lcom/roidapp/cloudlib/sns/basepost/bj;

    move-object v3, p0

    move/from16 v4, p8

    move/from16 v5, p9

    move-wide/from16 v6, p5

    move v8, p3

    invoke-direct/range {v2 .. v8}, Lcom/roidapp/cloudlib/sns/basepost/bj;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;IIJI)V

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    const/16 v4, 0x21

    invoke-virtual {p1, v2, v9, v3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 290
    const/4 v2, 0x1

    invoke-direct {p0, p1, p2, v9, v2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;IZ)V

    .line 292
    const-string v2, "\n"

    invoke-virtual {p1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 309
    :goto_0
    return-void

    .line 295
    :cond_0
    new-instance v2, Lcom/roidapp/cloudlib/sns/basepost/bk;

    move/from16 v0, p8

    move/from16 v1, p9

    invoke-direct {v2, p0, v0, v1, p4}, Lcom/roidapp/cloudlib/sns/basepost/bk;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;IILcom/roidapp/cloudlib/sns/b/x;)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    add-int/2addr v3, v9

    const/16 v4, 0x21

    invoke-virtual {p1, v2, v9, v3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 305
    const-string v2, "   "

    invoke-virtual {p1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto :goto_0
.end method

.method private a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;IZ)V
    .locals 11

    .prologue
    const/16 v10, 0x21

    .line 313
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->x:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    .line 314
    :goto_0
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 315
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v2

    .line 316
    const-string v0, "#"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/bl;

    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->s:I

    iget v4, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->t:I

    move-object v1, p0

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/cloudlib/sns/basepost/bl;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;Ljava/lang/String;IIZ)V

    invoke-virtual {v9}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    add-int/2addr v1, p3

    invoke-virtual {v9}, Ljava/util/regex/Matcher;->end()I

    move-result v2

    add-int/2addr v2, p3

    invoke-virtual {p1, v0, v1, v2, v10}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 325
    :cond_0
    new-instance v3, Lcom/roidapp/cloudlib/sns/basepost/bm;

    iget v5, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->o:I

    iget v6, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->p:I

    move-object v4, p0

    move-object v7, v2

    move v8, p4

    invoke-direct/range {v3 .. v8}, Lcom/roidapp/cloudlib/sns/basepost/bm;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;IILjava/lang/String;Z)V

    invoke-virtual {v9}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    add-int/2addr v0, p3

    invoke-virtual {v9}, Ljava/util/regex/Matcher;->end()I

    move-result v1

    add-int/2addr v1, p3

    invoke-virtual {p1, v3, v0, v1, v10}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 336
    :cond_1
    return-void
.end method

.method private a(Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 4

    .prologue
    .line 601
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 602
    if-gez v0, :cond_1

    .line 617
    :cond_0
    :goto_0
    return-void

    .line 607
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/basepost/d;->a()Lcom/roidapp/cloudlib/sns/basepost/d;

    move-result-object v1

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/d;->a(J)V

    .line 608
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 609
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->d(I)V

    .line 611
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v0

    if-nez v0, :cond_0

    .line 613
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->q()V

    .line 614
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/u;->b(Z)V

    .line 615
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->i()Z

    goto :goto_0
.end method

.method private a(Lcom/roidapp/cloudlib/sns/b/x;)V
    .locals 2

    .prologue
    .line 354
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/roidapp/cloudlib/sns/basepost/u;->a(Lcom/roidapp/cloudlib/sns/b/x;Ljava/lang/String;)V

    .line 355
    return-void
.end method

.method private a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    .line 339
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 340
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 341
    invoke-direct {p0, v1, p2, v2, v2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;IZ)V

    .line 342
    new-instance v0, Landroid/text/StaticLayout;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->u:Landroid/text/TextPaint;

    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->l:I

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/4 v7, 0x1

    move v6, v5

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 344
    invoke-virtual {p1, v0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a(Landroid/text/Layout;)V

    .line 348
    :goto_0
    return-void

    .line 346
    :cond_0
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/bc;I)V
    .locals 6

    .prologue
    .line 65
    .line 5800
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->j:Z

    if-eqz v0, :cond_0

    .line 5801
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    sget v2, Lcom/roidapp/cloudlib/at;->F:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 5802
    :goto_0
    return-void

    .line 5805
    :cond_0
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/aw;

    new-instance v1, Lcom/roidapp/cloudlib/sns/basepost/bq;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/bq;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;I)V

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/aw;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bb;)V

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    sget v2, Lcom/roidapp/cloudlib/at;->ap:I

    sget v3, Lcom/roidapp/cloudlib/at;->ao:I

    sget v4, Lcom/roidapp/cloudlib/at;->v:I

    sget v5, Lcom/roidapp/cloudlib/at;->j:I

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/sns/basepost/aw;->a(Landroid/content/Context;IIII)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/bc;Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/basepost/bc;Z)Z
    .locals 0

    .prologue
    .line 65
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->j:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/basepost/u;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/basepost/bc;I)V
    .locals 6

    .prologue
    .line 5945
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/aw;

    new-instance v1, Lcom/roidapp/cloudlib/sns/basepost/bg;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/bg;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;I)V

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/aw;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bb;)V

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    sget v2, Lcom/roidapp/cloudlib/at;->aA:I

    sget v3, Lcom/roidapp/cloudlib/at;->az:I

    sget v4, Lcom/roidapp/cloudlib/at;->av:I

    sget v5, Lcom/roidapp/cloudlib/at;->j:I

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/sns/basepost/aw;->a(Landroid/content/Context;IIII)V

    .line 65
    return-void
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/b/p;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/basepost/bc;)Ljava/util/List;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/basepost/bc;)Lcom/roidapp/cloudlib/sns/b/x;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    return-object v0
.end method

.method private j()Z
    .locals 2

    .prologue
    .line 476
    const/4 v0, 0x1

    .line 477
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 478
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->k()V

    .line 479
    const/4 v0, 0x0

    .line 482
    :cond_0
    return v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 1364
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final a(I)I
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 1369
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 1370
    iget-boolean v2, v0, Lcom/roidapp/cloudlib/sns/b/n;->g:Z

    if-eqz v2, :cond_1

    .line 1371
    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->m:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1372
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->C:Z

    move v0, v1

    .line 1378
    :goto_0
    return v0

    .line 1375
    :cond_0
    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    move v0, v1

    .line 1378
    goto :goto_0
.end method

.method public final a(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/bi;
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x0

    .line 1016
    packed-switch p2, :pswitch_data_0

    .line 1051
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 1019
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->v:I

    invoke-virtual {v0, v1, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 1020
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->B:Z

    if-nez v0, :cond_0

    .line 1021
    sget v0, Lcom/roidapp/cloudlib/ar;->aE:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1023
    :cond_0
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/bt;

    invoke-direct {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bt;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 1026
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->u:I

    invoke-virtual {v0, v1, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 1027
    sget v0, Lcom/roidapp/cloudlib/ar;->ar:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1028
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 1031
    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->e:I

    iput v3, v1, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 1032
    iget v3, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->e:I

    iput v3, v1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 1033
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1036
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->z:Z

    if-nez v0, :cond_1

    .line 1037
    sget v0, Lcom/roidapp/cloudlib/ar;->aC:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1040
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->A:Z

    if-eqz v0, :cond_2

    .line 1041
    sget v0, Lcom/roidapp/cloudlib/ar;->aK:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1042
    sget v0, Lcom/roidapp/cloudlib/ar;->ah:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1045
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->C:Z

    if-nez v0, :cond_3

    .line 1046
    sget v0, Lcom/roidapp/cloudlib/ar;->M:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1049
    :cond_3
    new-instance v0, Lcom/roidapp/cloudlib/sns/basepost/bs;

    invoke-direct {v0, v2}, Lcom/roidapp/cloudlib/sns/basepost/bs;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 1016
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Landroid/view/View;)Landroid/view/View;
    .locals 2

    .prologue
    .line 368
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 369
    if-eqz v0, :cond_1

    .line 370
    instance-of v1, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;

    if-eqz v1, :cond_0

    .line 371
    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/bs;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->j:Landroid/view/View;

    .line 380
    :goto_0
    return-object v0

    .line 373
    :cond_0
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->B:Z

    if-nez v1, :cond_1

    .line 374
    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/bt;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->k:Landroid/view/View;

    goto :goto_0

    .line 380
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic a(Ljava/lang/Object;)Lcom/bumptech/glide/e;
    .locals 2

    .prologue
    .line 65
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/n;

    .line 5412
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/o;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->f()Lcom/bumptech/glide/c;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v0

    .line 65
    return-object v0
.end method

.method public final a(J)V
    .locals 7

    .prologue
    .line 883
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 884
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 885
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 886
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 887
    iget-boolean v3, v0, Lcom/roidapp/cloudlib/sns/b/n;->g:Z

    if-eqz v3, :cond_1

    .line 888
    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    cmp-long v3, v4, p1

    if-nez v3, :cond_1

    .line 889
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/n;)V

    .line 896
    :cond_0
    return-void

    .line 885
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/widget/bi;I)V
    .locals 20

    .prologue
    .line 1062
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/cloudlib/sns/b/n;

    .line 1063
    iget-object v15, v2, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    .line 1064
    iget-object v0, v2, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    move-object/from16 v16, v0

    .line 1066
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 1295
    :cond_0
    :goto_0
    return-void

    .line 1068
    :pswitch_0
    check-cast p1, Lcom/roidapp/cloudlib/sns/basepost/bt;

    .line 1070
    iget-object v2, v15, Lcom/roidapp/cloudlib/sns/b/o;->n:Ljava/lang/String;

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    move v3, v2

    .line 5302
    :goto_1
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->t:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 5304
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v4, v5}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v6

    .line 5306
    if-eqz v3, :cond_3

    .line 5307
    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->e:I

    div-int/lit8 v4, v4, 0x3

    mul-int/lit8 v4, v4, 0x2

    .line 5315
    :goto_2
    iput v6, v2, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 5317
    const/4 v5, 0x0

    iget v7, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    sub-int v7, v4, v7

    iget v8, v2, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    sub-int/2addr v7, v8

    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 5318
    const/4 v7, 0x0

    iget v8, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    sub-int/2addr v4, v8

    iget v8, v2, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v4, v8

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 5320
    iput v5, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 5321
    iput v4, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 5323
    move-object/from16 v0, p1

    iget-object v7, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->t:Landroid/widget/ImageView;

    invoke-virtual {v7, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5327
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->u:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 5330
    if-eqz v3, :cond_1

    .line 5331
    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->e:I

    div-int/lit8 v4, v4, 0x3

    move v5, v4

    .line 5335
    :cond_1
    iput v6, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 5336
    iput v6, v2, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 5338
    iput v5, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 5339
    iput v4, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 5341
    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->u:Landroid/widget/ImageView;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5345
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->v:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 5346
    if-eqz v3, :cond_4

    .line 5347
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->v:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 5349
    iput v6, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 5350
    iput v6, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 5352
    iput v5, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 5353
    iput v5, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 5355
    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->v:Landroid/widget/ImageView;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5356
    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->v:Landroid/widget/ImageView;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1073
    :goto_3
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->o:Landroid/widget/TextView;

    move-object/from16 v0, v16

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1075
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->l:Landroid/view/View;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1076
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->l:Landroid/view/View;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1078
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    move-object/from16 v0, v16

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v2

    sget-object v4, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v2

    new-instance v4, Lcom/roidapp/cloudlib/sns/e/a;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->n:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-direct {v4, v5}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 1085
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 1086
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1088
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->j:Landroid/widget/ImageView;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 1089
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->j:Landroid/widget/ImageView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1092
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->s:Landroid/view/ViewGroup;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    .line 1093
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->s:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1095
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    invoke-static/range {v16 .. v16}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v2

    .line 1096
    move-object/from16 v0, v16

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-static {v2, v4}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Lcom/roidapp/cloudlib/sns/b/c;)Lcom/roidapp/cloudlib/sns/b/c;

    move-result-object v2

    .line 1098
    sget-object v4, Lcom/roidapp/cloudlib/sns/basepost/bi;->a:[I

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/c;->ordinal()I

    move-result v2

    aget v2, v4, v2

    packed-switch v2, :pswitch_data_1

    .line 1118
    :goto_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    move-object/from16 v0, v16

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v2

    sget-object v4, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v2

    new-instance v4, Lcom/roidapp/cloudlib/sns/e/a;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->n:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-direct {v4, v5}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 1126
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v4, v15, Lcom/roidapp/cloudlib/sns/b/o;->e:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    sget-object v4, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v2

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->t:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 1133
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v4, v15, Lcom/roidapp/cloudlib/sns/b/o;->m:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    sget-object v4, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v2

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->u:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 1141
    if-eqz v3, :cond_0

    .line 1142
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v3, v15, Lcom/roidapp/cloudlib/sns/b/o;->n:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    sget-object v3, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v2

    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->v:Landroid/widget/ImageView;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    goto/16 :goto_0

    .line 1070
    :cond_2
    const/4 v2, 0x0

    move v3, v2

    goto/16 :goto_1

    .line 5309
    :cond_3
    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->e:I

    div-int/lit8 v4, v4, 0x2

    goto/16 :goto_2

    .line 5358
    :cond_4
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->v:Landroid/widget/ImageView;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3

    .line 1100
    :pswitch_1
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->r:Landroid/widget/ProgressBar;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1101
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    sget v5, Lcom/roidapp/cloudlib/at;->N:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1102
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    const-string v4, "#ffffff"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1103
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    sget v4, Lcom/roidapp/cloudlib/aq;->k:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_4

    .line 1106
    :pswitch_2
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->r:Landroid/widget/ProgressBar;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1107
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    sget v5, Lcom/roidapp/cloudlib/at;->P:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1108
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/cloudlib/ao;->a:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1109
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    sget v4, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_4

    .line 1112
    :pswitch_3
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->r:Landroid/widget/ProgressBar;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1113
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    const-string v4, ""

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1114
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bt;->q:Landroid/widget/TextView;

    sget v4, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_4

    .line 1154
    :pswitch_4
    check-cast p1, Lcom/roidapp/cloudlib/sns/basepost/bs;

    .line 1155
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->s:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->setClickable(Z)V

    .line 1157
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->t:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1158
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->u:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1159
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->v:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1160
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->j:Landroid/view/View;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1161
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->o:Landroid/widget/ImageView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1162
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->p:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1163
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->C:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1165
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->C:Landroid/widget/TextView;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 1166
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->C:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1168
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    if-eqz v3, :cond_0

    .line 1170
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    iget-object v3, v2, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-static {v3}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v3

    iget-object v4, v2, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v4, v4, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-static {v3, v4}, Lcom/roidapp/cloudlib/sns/g/f;->b(Lcom/roidapp/cloudlib/sns/g/f;I)Lcom/roidapp/cloudlib/sns/g/a;

    move-result-object v17

    .line 1174
    iget-object v3, v2, Lcom/roidapp/cloudlib/sns/b/n;->f:Lcom/roidapp/cloudlib/sns/b/g;

    if-eqz v3, :cond_5

    .line 1175
    iget-object v3, v2, Lcom/roidapp/cloudlib/sns/b/n;->f:Lcom/roidapp/cloudlib/sns/b/g;

    move-object/from16 v0, v17

    invoke-static {v0, v3}, Lcom/roidapp/cloudlib/sns/g/a;->a(Lcom/roidapp/cloudlib/sns/g/a;Lcom/roidapp/cloudlib/sns/b/g;)Lcom/roidapp/cloudlib/sns/b/g;

    move-result-object v3

    .line 1177
    sget-object v4, Lcom/roidapp/cloudlib/sns/basepost/bi;->b:[I

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/b/g;->ordinal()I

    move-result v3

    aget v3, v4, v3

    packed-switch v3, :pswitch_data_2

    .line 1196
    :cond_5
    :goto_5
    iget-object v3, v2, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    move-object/from16 v0, v17

    invoke-static {v0, v3}, Lcom/roidapp/cloudlib/sns/g/a;->a(Lcom/roidapp/cloudlib/sns/g/a;Lcom/roidapp/cloudlib/sns/b/a/a;)Lcom/roidapp/cloudlib/sns/b/a/a;

    move-result-object v3

    iput-object v3, v2, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 1197
    iget-object v3, v2, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    if-eqz v3, :cond_b

    .line 1198
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->r:Landroid/view/ViewGroup;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1199
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 1201
    iget-object v3, v2, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/sns/b/a/a;->size()I

    move-result v3

    .line 1202
    const/4 v5, 0x4

    if-le v3, v5, :cond_7

    .line 1203
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    sget v5, Lcom/roidapp/cloudlib/at;->s:I

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x1

    move-object/from16 v0, p0

    iget v11, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->m:I

    move-object/from16 v0, p0

    iget v12, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->n:I

    move-object/from16 v3, p0

    move/from16 v6, p2

    invoke-direct/range {v3 .. v12}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;ILcom/roidapp/cloudlib/sns/b/x;JZII)V

    .line 1204
    const-string v3, "\n"

    invoke-virtual {v4, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 1205
    const/4 v3, 0x3

    move v14, v3

    .line 1209
    :goto_6
    if-ltz v14, :cond_8

    .line 1210
    iget-object v3, v2, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-virtual {v3, v14}, Lcom/roidapp/cloudlib/sns/b/a/a;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lcom/roidapp/cloudlib/sns/b/a;

    .line 1211
    iget-object v7, v13, Lcom/roidapp/cloudlib/sns/b/a;->d:Lcom/roidapp/cloudlib/sns/b/x;

    .line 1212
    iget-wide v8, v13, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    .line 1213
    iget-object v3, v13, Lcom/roidapp/cloudlib/sns/b/a;->d:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v5, v3, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    .line 1215
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v3, :cond_6

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v3, :cond_6

    iget-wide v10, v7, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v0, v3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    move-wide/from16 v18, v0

    cmp-long v3, v10, v18

    if-nez v3, :cond_6

    .line 1216
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    invoke-static {v7}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v3

    .line 1217
    iget-object v5, v13, Lcom/roidapp/cloudlib/sns/b/a;->d:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v5, v5, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-static {v3, v5}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1219
    :cond_6
    const/4 v10, 0x0

    move-object/from16 v0, p0

    iget v11, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->o:I

    move-object/from16 v0, p0

    iget v12, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->p:I

    move-object/from16 v3, p0

    move/from16 v6, p2

    invoke-direct/range {v3 .. v12}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;ILcom/roidapp/cloudlib/sns/b/x;JZII)V

    .line 1220
    iget-object v5, v13, Lcom/roidapp/cloudlib/sns/b/a;->c:Ljava/lang/String;

    const/4 v10, 0x1

    move-object/from16 v0, p0

    iget v11, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->q:I

    move-object/from16 v0, p0

    iget v12, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->r:I

    move-object/from16 v3, p0

    move/from16 v6, p2

    invoke-direct/range {v3 .. v12}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Landroid/text/SpannableStringBuilder;Ljava/lang/CharSequence;ILcom/roidapp/cloudlib/sns/b/x;JZII)V

    .line 1209
    add-int/lit8 v3, v14, -0x1

    move v14, v3

    goto :goto_6

    .line 1179
    :pswitch_5
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->w:Landroid/widget/ProgressBar;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1180
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->x:Landroid/widget/ImageView;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1181
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->x:Landroid/widget/ImageView;

    sget v4, Lcom/roidapp/cloudlib/aq;->o:I

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_5

    .line 1184
    :pswitch_6
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->w:Landroid/widget/ProgressBar;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1185
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->x:Landroid/widget/ImageView;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1186
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->x:Landroid/widget/ImageView;

    sget v4, Lcom/roidapp/cloudlib/aq;->p:I

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_5

    .line 1189
    :pswitch_7
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->w:Landroid/widget/ProgressBar;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 1190
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->x:Landroid/widget/ImageView;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_5

    .line 1207
    :cond_7
    add-int/lit8 v3, v3, -0x1

    move v14, v3

    goto/16 :goto_6

    .line 1224
    :cond_8
    new-instance v3, Landroid/text/StaticLayout;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->u:Landroid/text/TextPaint;

    move-object/from16 v0, p0

    iget v6, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->l:I

    sget-object v7, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    const/high16 v8, 0x3f800000    # 1.0f

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x1

    invoke-direct/range {v3 .. v10}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 1226
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->s:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    invoke-virtual {v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->a(Landroid/text/Layout;)V

    .line 1232
    :goto_7
    const/4 v2, 0x0

    .line 1234
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v3, :cond_c

    move-object/from16 v0, v16

    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v6, v3, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    cmp-long v3, v4, v6

    if-nez v3, :cond_c

    .line 1235
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    invoke-static/range {v16 .. v16}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v2

    .line 1236
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->l:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v4, v4, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-static {v2, v4}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1237
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v3, v3, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/roidapp/cloudlib/sns/g/f;->b(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    .line 1239
    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;)Ljava/lang/String;

    move-result-object v2

    .line 1244
    :goto_8
    if-eqz v2, :cond_d

    .line 1245
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v3}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v3

    move-object/from16 v0, v16

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v4}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/a;)Lcom/bumptech/glide/a;

    move-result-object v2

    sget-object v3, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v2

    new-instance v3, Lcom/roidapp/cloudlib/sns/e/a;

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->k:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-direct {v3, v4}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 1261
    :goto_9
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->j:Landroid/view/View;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1262
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->t:Landroid/view/ViewGroup;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    .line 1263
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->u:Landroid/view/ViewGroup;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    .line 1264
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->o:Landroid/widget/ImageView;

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 1266
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->z:Z

    if-eqz v2, :cond_9

    .line 1267
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->v:Landroid/view/ViewGroup;

    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    .line 1270
    :cond_9
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->m:Landroid/widget/TextView;

    invoke-static {}, Lcom/roidapp/cloudlib/sns/h;->a()Lcom/roidapp/cloudlib/sns/h;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    iget-wide v6, v15, Lcom/roidapp/cloudlib/sns/b/o;->j:J

    invoke-virtual {v3, v4, v6, v7}, Lcom/roidapp/cloudlib/sns/h;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1271
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->z:Landroid/widget/TextView;

    iget v3, v15, Lcom/roidapp/cloudlib/sns/b/o;->i:I

    move-object/from16 v0, v17

    invoke-static {v0, v3}, Lcom/roidapp/cloudlib/sns/g/a;->b(Lcom/roidapp/cloudlib/sns/g/a;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1272
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->y:Landroid/widget/TextView;

    iget v3, v15, Lcom/roidapp/cloudlib/sns/b/o;->h:I

    move-object/from16 v0, v17

    invoke-static {v0, v3}, Lcom/roidapp/cloudlib/sns/g/a;->a(Lcom/roidapp/cloudlib/sns/g/a;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1274
    iget-object v2, v15, Lcom/roidapp/cloudlib/sns/b/o;->d:Ljava/lang/String;

    if-eqz v2, :cond_a

    .line 1275
    iget-boolean v2, v15, Lcom/roidapp/cloudlib/sns/b/o;->l:Z

    if-eqz v2, :cond_e

    .line 1276
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->q:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    iget-object v3, v15, Lcom/roidapp/cloudlib/sns/b/o;->d:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->y:Lcom/roidapp/cloudlib/sns/b/m;

    invoke-static {v2, v3, v4}, Lcom/roidapp/cloudlib/sns/b/k;->a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/m;)V

    .line 1283
    :cond_a
    :goto_a
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v3, v15, Lcom/roidapp/cloudlib/sns/b/o;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    sget-object v3, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v2

    new-instance v3, Lcom/roidapp/cloudlib/sns/e/c;

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->o:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    iget-object v5, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->n:Landroid/widget/ProgressBar;

    move-object/from16 v0, p1

    iget-object v6, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->p:Landroid/widget/TextView;

    invoke-direct {v3, v4, v5, v6}, Lcom/roidapp/cloudlib/sns/e/c;-><init>(Landroid/widget/ImageView;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    goto/16 :goto_0

    .line 1229
    :cond_b
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->r:Landroid/view/ViewGroup;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_7

    .line 1241
    :cond_c
    move-object/from16 v0, p1

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->l:Landroid/widget/TextView;

    move-object/from16 v0, v16

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_8

    .line 1253
    :cond_d
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bc;->b:Landroid/support/v4/app/Fragment;

    invoke-static {v2}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    move-object/from16 v0, v16

    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v2

    sget-object v3, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v2

    new-instance v3, Lcom/roidapp/cloudlib/sns/e/a;

    move-object/from16 v0, p1

    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->k:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-direct {v3, v4}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    goto/16 :goto_9

    .line 1278
    :cond_e
    move-object/from16 v0, p1

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/basepost/bs;->q:Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    iget-object v3, v15, Lcom/roidapp/cloudlib/sns/b/o;->d:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;)V

    goto/16 :goto_a

    .line 1066
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
    .end packed-switch

    .line 1098
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 1177
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/b/a/e;)V
    .locals 2

    .prologue
    .line 401
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->j:Z

    .line 402
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    if-nez v0, :cond_1

    .line 413
    :cond_0
    :goto_0
    return-void

    .line 406
    :cond_1
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->f:I

    .line 407
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 408
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->c:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->b(I)V

    .line 409
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c()V

    .line 410
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 411
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/u;->b(Z)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/b/p;Lcom/roidapp/cloudlib/sns/b/x;)V
    .locals 0

    .prologue
    .line 988
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    .line 989
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    .line 990
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 994
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    .line 995
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 1007
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->j:Z

    .line 1008
    return-void
.end method

.method public final b(I)J
    .locals 2

    .prologue
    .line 272
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final bridge synthetic b()[I
    .locals 3

    .prologue
    .line 65
    .line 5421
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    iget v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->e:I

    aput v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->e:I

    aput v2, v0, v1

    .line 65
    return-object v0
.end method

.method public final b_(I)V
    .locals 1

    .prologue
    .line 429
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 434
    :goto_0
    return-void

    .line 433
    :cond_0
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    goto :goto_0
.end method

.method public final c(I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1392
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->E:I

    sub-int v0, p1, v0

    add-int/lit8 v0, v0, 0x1

    .line 1393
    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 1394
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->D:Ljava/util/List;

    .line 1404
    :goto_0
    return-object v0

    .line 1397
    :cond_1
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(I)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 1404
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->D:Ljava/util/List;

    goto :goto_0

    .line 1399
    :pswitch_0
    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1400
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 1401
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    add-int/lit8 v2, v0, 0x1

    invoke-interface {v1, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 1397
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 359
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->j:Z

    .line 360
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 416
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->j:Z

    .line 418
    return-void
.end method

.method public final e(I)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 857
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->m()V

    .line 858
    const/4 v2, 0x0

    .line 859
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 860
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 861
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 862
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 863
    iget-object v4, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    if-eqz v4, :cond_0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    if-ne v0, p1, :cond_0

    .line 864
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    move v0, v1

    .line 870
    :goto_0
    if-eqz v0, :cond_1

    .line 871
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c()V

    .line 872
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->q()V

    .line 873
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    sget v3, Lcom/roidapp/cloudlib/at;->G:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 874
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v0

    if-nez v0, :cond_1

    .line 876
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/u;->b(Z)V

    .line 877
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->i()Z

    .line 880
    :cond_1
    return-void

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 984
    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->f:I

    return v0
.end method

.method public final f(I)V
    .locals 0

    .prologue
    .line 980
    iput p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->f:I

    .line 981
    return-void
.end method

.method public final g(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1383
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation

    .prologue
    .line 998
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->d:Ljava/util/List;

    return-object v0
.end method

.method public final h(I)V
    .locals 0

    .prologue
    .line 1387
    iput p1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->E:I

    .line 1388
    return-void
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 1003
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->j:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 1426
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v0

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->F:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final j_()V
    .locals 1

    .prologue
    .line 471
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/basepost/u;->p()V

    .line 472
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 11

    .prologue
    const/4 v10, 0x0

    const/4 v6, 0x1

    const-wide/16 v8, 0x1

    .line 487
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 489
    iput-boolean v6, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->F:Z

    .line 491
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    if-nez v1, :cond_0

    .line 492
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    .line 493
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v1, :cond_0

    .line 494
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    .line 497
    :cond_0
    sget v1, Lcom/roidapp/cloudlib/ar;->ax:I

    if-ne v0, v1, :cond_3

    .line 498
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->j()Z

    move-result v0

    if-nez v0, :cond_2

    .line 597
    :cond_1
    :goto_0
    return-void

    .line 501
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 502
    invoke-direct {p0, v0, v10}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(IZ)V

    goto :goto_0

    .line 504
    :cond_3
    sget v1, Lcom/roidapp/cloudlib/ar;->N:I

    if-ne v0, v1, :cond_4

    .line 505
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 510
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/ToComments/Layout/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/ToComments/Layout/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 512
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 513
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->k:Lcom/roidapp/cloudlib/sns/basepost/u;

    invoke-interface {v1, v0, v6}, Lcom/roidapp/cloudlib/sns/basepost/u;->a(IZ)V

    goto :goto_0

    .line 515
    :cond_4
    sget v1, Lcom/roidapp/cloudlib/ar;->aC:I

    if-ne v0, v1, :cond_6

    .line 516
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/More/Layout/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/More/Layout/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 521
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/o;

    .line 523
    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/o;->b:J

    .line 2901
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_5

    .line 2902
    new-instance v1, Lcom/roidapp/baselib/view/r;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    new-array v3, v6, [Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/cloudlib/at;->v:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v10

    invoke-direct {v1, v2, v3, v10, v6}, Lcom/roidapp/baselib/view/r;-><init>(Landroid/content/Context;[Ljava/lang/String;II)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->g:Lcom/roidapp/baselib/view/r;

    .line 2904
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->g:Lcom/roidapp/baselib/view/r;

    new-instance v2, Lcom/roidapp/cloudlib/sns/basepost/be;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/basepost/be;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;)V

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/r;->a(Lcom/roidapp/baselib/view/u;)V

    .line 525
    :goto_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->g:Lcom/roidapp/baselib/view/r;

    iget v0, v0, Lcom/roidapp/cloudlib/sns/b/o;->a:I

    invoke-virtual {v1, p1, v0}, Lcom/roidapp/baselib/view/r;->a(Landroid/view/View;I)V

    goto/16 :goto_0

    .line 2921
    :cond_5
    new-instance v1, Lcom/roidapp/baselib/view/r;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    new-array v3, v6, [Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/cloudlib/at;->av:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v10

    invoke-direct {v1, v2, v3, v10, v6}, Lcom/roidapp/baselib/view/r;-><init>(Landroid/content/Context;[Ljava/lang/String;II)V

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->g:Lcom/roidapp/baselib/view/r;

    .line 2923
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->g:Lcom/roidapp/baselib/view/r;

    new-instance v2, Lcom/roidapp/cloudlib/sns/basepost/bf;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/basepost/bf;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;)V

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/r;->a(Lcom/roidapp/baselib/view/u;)V

    goto :goto_1

    .line 526
    :cond_6
    sget v1, Lcom/roidapp/cloudlib/ar;->aJ:I

    if-ne v0, v1, :cond_7

    .line 527
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 530
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/ToPersonalCenter/FromPostTittle/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/ToPersonalCenter/FromPostTittle/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 532
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 533
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    goto/16 :goto_0

    .line 534
    :cond_7
    sget v1, Lcom/roidapp/cloudlib/ar;->av:I

    if-ne v0, v1, :cond_8

    .line 535
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 538
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/ToPersonalCenter/FromPostThumbnail/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/ToPersonalCenter/FromPostThumbnail/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 540
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 541
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    goto/16 :goto_0

    .line 542
    :cond_8
    sget v1, Lcom/roidapp/cloudlib/ar;->ar:I

    if-ne v0, v1, :cond_a

    .line 543
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 544
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->w:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x12c

    cmp-long v0, v2, v4

    if-gez v0, :cond_9

    iget v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->v:I

    if-ne v1, v0, :cond_9

    .line 545
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 548
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->v:I

    .line 549
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->w:J

    .line 551
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 552
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 553
    invoke-direct {p0, v1, v6}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(IZ)V

    goto/16 :goto_0

    .line 555
    :cond_9
    iput v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->v:I

    .line 556
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->w:J

    goto/16 :goto_0

    .line 558
    :cond_a
    sget v1, Lcom/roidapp/cloudlib/ar;->aj:I

    if-ne v0, v1, :cond_c

    .line 559
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->j()Z

    move-result v0

    if-nez v0, :cond_b

    .line 560
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Suggested/Follow/Click/NoLogin"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Suggested/Follow/Click/NoLogin"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto/16 :goto_0

    .line 564
    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 565
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/roidapp/cloudlib/sns/b/n;

    .line 566
    sget-object v0, Lcom/roidapp/cloudlib/sns/basepost/bi;->a:[I

    iget-object v1, v7, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/b/c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 568
    :pswitch_0
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Suggested/Follow/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 569
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Suggested/Follow/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 572
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 3623
    sget v1, Lcom/roidapp/cloudlib/ar;->ai:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3624
    sget v1, Lcom/roidapp/cloudlib/ar;->aj:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 3625
    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3626
    sget v2, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 3628
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v1

    iget-object v2, v7, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 3629
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->h:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->i:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, v7, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v4, v4, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v6, Lcom/roidapp/cloudlib/sns/basepost/bn;

    invoke-direct {v6, p0, v0, v7}, Lcom/roidapp/cloudlib/sns/basepost/bn;-><init>(Lcom/roidapp/cloudlib/sns/basepost/bc;Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/n;)V

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 582
    :cond_c
    sget v1, Lcom/roidapp/cloudlib/ar;->am:I

    if-ne v0, v1, :cond_d

    .line 583
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 586
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/ToPersonalCenter/FromPostTittle/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/ToPersonalCenter/FromPostTittle/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 588
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 589
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    goto/16 :goto_0

    .line 590
    :cond_d
    sget v1, Lcom/roidapp/cloudlib/ar;->al:I

    if-ne v0, v1, :cond_1

    .line 591
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Suggested/Close/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 592
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/bc;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Suggested/Close/Click"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 593
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 594
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/n;

    .line 595
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Lcom/roidapp/cloudlib/sns/b/n;)V

    goto/16 :goto_0

    .line 566
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

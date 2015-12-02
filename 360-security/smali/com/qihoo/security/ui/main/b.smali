.class public Lcom/qihoo/security/ui/main/b;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Lcom/nineoldandroids/a/k;

.field private b:Lcom/nineoldandroids/a/k;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Lcom/nineoldandroids/a/a$a;

.field private f:Lcom/nineoldandroids/a/a$a;

.field private g:Landroid/view/View$OnTouchListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lcom/qihoo/security/ui/main/b$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/main/b$1;-><init>(Lcom/qihoo/security/ui/main/b;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/main/b;->g:Landroid/view/View$OnTouchListener;

    .line 36
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/main/b;)Lcom/nineoldandroids/a/k;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    return-object v0
.end method

.method private a(Landroid/view/View;Z)V
    .locals 3

    .prologue
    .line 171
    if-eqz p1, :cond_1

    .line 173
    if-eqz p2, :cond_0

    .line 174
    const/4 v0, 0x0

    .line 178
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 179
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 180
    check-cast p1, Landroid/view/ViewGroup;

    .line 182
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_1

    .line 183
    const/4 v0, 0x0

    :goto_1
    if-ge v0, v1, :cond_1

    .line 184
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-direct {p0, v2, p2}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Z)V

    .line 183
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->g:Landroid/view/View$OnTouchListener;

    goto :goto_0

    .line 189
    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 39
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 40
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->c()V

    .line 41
    iput-object v1, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    .line 42
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->e:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->e:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, v1}, Lcom/nineoldandroids/a/a$a;->b(Lcom/nineoldandroids/a/a;)V

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->c:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 46
    iput-object v1, p0, Lcom/qihoo/security/ui/main/b;->c:Landroid/view/View;

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 51
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->c()V

    .line 52
    iput-object v1, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    .line 53
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->f:Lcom/nineoldandroids/a/a$a;

    if-eqz v0, :cond_2

    .line 54
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->f:Lcom/nineoldandroids/a/a$a;

    invoke-interface {v0, v1}, Lcom/nineoldandroids/a/a$a;->b(Lcom/nineoldandroids/a/a;)V

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->d:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 57
    iput-object v1, p0, Lcom/qihoo/security/ui/main/b;->d:Landroid/view/View;

    .line 61
    :cond_3
    return-void
.end method

.method public a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;JLandroid/view/View;Lcom/nineoldandroids/a/a$a;J)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x2

    .line 71
    invoke-virtual {p0}, Lcom/qihoo/security/ui/main/b;->a()V

    .line 72
    if-eqz p5, :cond_3

    .line 73
    const-string/jumbo v0, "alpha"

    new-array v1, v2, [F

    fill-array-data v1, :array_0

    invoke-static {p5, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    .line 74
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0, p3, p4}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 78
    :goto_0
    if-eqz p1, :cond_4

    .line 79
    const-string/jumbo v0, "alpha"

    new-array v1, v2, [F

    fill-array-data v1, :array_1

    invoke-static {p1, v0, v1}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0, p7, p8}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    .line 84
    :goto_1
    iput-object p1, p0, Lcom/qihoo/security/ui/main/b;->c:Landroid/view/View;

    .line 85
    iput-object p5, p0, Lcom/qihoo/security/ui/main/b;->d:Landroid/view/View;

    .line 86
    iput-object p2, p0, Lcom/qihoo/security/ui/main/b;->e:Lcom/nineoldandroids/a/a$a;

    .line 87
    iput-object p6, p0, Lcom/qihoo/security/ui/main/b;->f:Lcom/nineoldandroids/a/a$a;

    .line 88
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Z)V

    .line 89
    const/4 v0, 0x1

    invoke-direct {p0, p5, v0}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Z)V

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    new-instance v1, Lcom/qihoo/security/ui/main/b$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/qihoo/security/ui/main/b$2;-><init>(Lcom/qihoo/security/ui/main/b;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_1

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    new-instance v1, Lcom/qihoo/security/ui/main/b$3;

    invoke-direct {v1, p0, p5, p6}, Lcom/qihoo/security/ui/main/b$3;-><init>(Lcom/qihoo/security/ui/main/b;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_5

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 168
    :cond_2
    :goto_2
    return-void

    .line 76
    :cond_3
    iput-object v3, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    goto :goto_0

    .line 82
    :cond_4
    iput-object v3, p0, Lcom/qihoo/security/ui/main/b;->a:Lcom/nineoldandroids/a/k;

    goto :goto_1

    .line 165
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    if-eqz v0, :cond_2

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/ui/main/b;->b:Lcom/nineoldandroids/a/k;

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    goto :goto_2

    .line 73
    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 79
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;Landroid/view/View;Lcom/nineoldandroids/a/a$a;)V
    .locals 10

    .prologue
    const-wide/16 v4, 0x15e

    .line 66
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    move-object v7, p4

    move-wide v8, v4

    invoke-virtual/range {v1 .. v9}, Lcom/qihoo/security/ui/main/b;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;JLandroid/view/View;Lcom/nineoldandroids/a/a$a;J)V

    .line 67
    return-void
.end method

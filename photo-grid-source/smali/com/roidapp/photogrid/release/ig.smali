.class public Lcom/roidapp/photogrid/release/ig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public C:I

.field public D:I

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:Lcom/roidapp/imagelib/b/b;

.field public transient j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field public transient k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field public l:I

.field public m:Z

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field p:I

.field q:I

.field r:I

.field s:I

.field t:F

.field u:F

.field v:F

.field public w:Z

.field x:I

.field public transient y:Lcom/roidapp/photogrid/release/lc;

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->l:I

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->l:I

    .line 40
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 51
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    .line 52
    iput-object v4, p0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 53
    iput-object v4, p0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    .line 54
    iput v1, p0, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 55
    iput v2, p0, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 56
    iput v2, p0, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 57
    iput v3, p0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 58
    iput v3, p0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 59
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 60
    iput v1, p0, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 61
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ig;->w:Z

    .line 62
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    .line 63
    return-void
.end method


# virtual methods
.method public final a()Lcom/roidapp/photogrid/release/ig;
    .locals 6

    .prologue
    .line 66
    new-instance v0, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/ig;-><init>()V

    .line 67
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ig;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->a:Ljava/lang/String;

    .line 68
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    .line 69
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 70
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 71
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    .line 72
    iget v1, p0, Lcom/roidapp/photogrid/release/ig;->p:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 73
    iget v1, p0, Lcom/roidapp/photogrid/release/ig;->r:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 74
    iget v1, p0, Lcom/roidapp/photogrid/release/ig;->s:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 75
    iget v1, p0, Lcom/roidapp/photogrid/release/ig;->t:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 76
    iget v1, p0, Lcom/roidapp/photogrid/release/ig;->u:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 77
    iget v1, p0, Lcom/roidapp/photogrid/release/ig;->v:F

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 78
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ig;->w:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->w:Z

    .line 79
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 80
    iget v1, p0, Lcom/roidapp/photogrid/release/ig;->x:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 81
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ig;->z:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->z:Z

    .line 82
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ig;->B:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 83
    new-instance v1, Lcom/roidapp/imagelib/b/b;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    iget v2, v2, Lcom/roidapp/imagelib/b/b;->a:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    iget v3, v3, Lcom/roidapp/imagelib/b/b;->b:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    iget v4, v4, Lcom/roidapp/imagelib/b/b;->c:I

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    iget v5, v5, Lcom/roidapp/imagelib/b/b;->d:I

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/roidapp/imagelib/b/b;-><init>(IIII)V

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    .line 85
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 86
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ig;->A:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->A:Z

    .line 87
    iget v1, p0, Lcom/roidapp/photogrid/release/ig;->C:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->C:I

    .line 88
    iget v1, p0, Lcom/roidapp/photogrid/release/ig;->D:I

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->D:I

    .line 89
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ig;->E:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->E:Z

    .line 90
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ig;->F:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->F:Z

    .line 91
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ig;->G:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->G:Z

    .line 92
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ig;->H:Z

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->H:Z

    .line 93
    return-object v0
.end method

.method public final b()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 121
    iput v2, p0, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 122
    iput v3, p0, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 123
    iput v3, p0, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 124
    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 125
    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 126
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 127
    iput v2, p0, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 128
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ig;->a:Ljava/lang/String;

    .line 129
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 130
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 131
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ig;->d:Ljava/lang/String;

    .line 132
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    .line 133
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 134
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->l:I

    .line 135
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    .line 136
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 139
    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 140
    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 141
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 142
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 144
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 10
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ig;->a()Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 158
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ig;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 169
    :goto_0
    return-object v0

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->a:Ljava/lang/String;

    goto :goto_0

    .line 168
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    goto :goto_0

    .line 169
    :cond_2
    const-string v0, ""

    goto :goto_0
.end method

.method public final f()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 193
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 194
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ig;->a:Ljava/lang/String;

    .line 195
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 196
    return-void
.end method

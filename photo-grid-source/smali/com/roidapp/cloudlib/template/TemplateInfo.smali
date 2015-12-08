.class public Lcom/roidapp/cloudlib/template/TemplateInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:J

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:I

.field private i:F

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private volatile o:Z

.field private volatile p:I

.field private volatile q:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/ProgressBar;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->p:I

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 0

    .prologue
    .line 97
    iput p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->i:F

    .line 98
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 69
    iput p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->p:I

    .line 70
    return-void
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 81
    iput-wide p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->a:J

    .line 82
    return-void
.end method

.method public final a(Landroid/widget/ProgressBar;)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->q:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->q:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->clear()V

    .line 57
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->q:Ljava/lang/ref/WeakReference;

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->o:Z

    .line 59
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->e:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 153
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->j:Z

    .line 154
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->o:Z

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->o:Z

    .line 51
    return-void
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 129
    iput p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->f:I

    .line 130
    return-void
.end method

.method public final b(J)V
    .locals 1

    .prologue
    .line 89
    iput-wide p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->b:J

    .line 90
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->c:Ljava/lang/String;

    .line 114
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 161
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->k:Z

    .line 162
    return-void
.end method

.method public final c()Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->q:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 63
    const/4 v0, 0x0

    .line 65
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->q:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    goto :goto_0
.end method

.method public final c(I)V
    .locals 0

    .prologue
    .line 137
    iput p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->h:I

    .line 138
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->d:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .prologue
    .line 169
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->l:Z

    .line 170
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->r()Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 73
    iget v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->p:I

    return v0
.end method

.method public final d(I)V
    .locals 0

    .prologue
    .line 145
    iput p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->g:I

    .line 146
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .prologue
    .line 177
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->m:Z

    .line 178
    return-void
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 236
    const/4 v0, 0x0

    return v0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 77
    iget-wide v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->a:J

    return-wide v0
.end method

.method public final e(Z)V
    .locals 0

    .prologue
    .line 185
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->n:Z

    .line 186
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 202
    if-ne p1, p0, :cond_1

    .line 207
    :cond_0
    :goto_0
    return v0

    .line 204
    :cond_1
    instance-of v2, p1, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-nez v2, :cond_2

    move v0, v1

    .line 205
    goto :goto_0

    .line 206
    :cond_2
    check-cast p1, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 207
    iget-wide v2, p1, Lcom/roidapp/cloudlib/template/TemplateInfo;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->a:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final f()F
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->i:F

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->c:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 191
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->j:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    add-int/lit16 v0, v0, 0x20f

    .line 192
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->h:I

    add-int/2addr v0, v1

    .line 193
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->g:I

    add-int/2addr v0, v1

    .line 194
    mul-int/lit8 v0, v0, 0x1f

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->i:F

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 195
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 196
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 197
    return v0

    .line 191
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final j()I
    .locals 1

    .prologue
    .line 125
    iget v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->f:I

    return v0
.end method

.method public final k()I
    .locals 1

    .prologue
    .line 133
    iget v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->h:I

    return v0
.end method

.method public final l()I
    .locals 1

    .prologue
    .line 141
    iget v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->g:I

    return v0
.end method

.method public final m()Z
    .locals 1

    .prologue
    .line 149
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->j:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    .prologue
    .line 157
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->k:Z

    return v0
.end method

.method public final o()Z
    .locals 1

    .prologue
    .line 165
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->l:Z

    return v0
.end method

.method public final p()Z
    .locals 1

    .prologue
    .line 173
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->m:Z

    return v0
.end method

.method public final q()Z
    .locals 1

    .prologue
    .line 181
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->n:Z

    return v0
.end method

.method public final r()Lcom/roidapp/cloudlib/template/TemplateInfo;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 212
    new-instance v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;-><init>()V

    .line 213
    iget-wide v2, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->a:J

    iput-wide v2, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->a:J

    .line 214
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->d:Ljava/lang/String;

    .line 215
    iget-wide v2, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->b:J

    iput-wide v2, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->b:J

    .line 216
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->c:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->c:Ljava/lang/String;

    .line 217
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->e:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->e:Ljava/lang/String;

    .line 218
    iget v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->f:I

    iput v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->f:I

    .line 219
    iget v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->g:I

    iput v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->g:I

    .line 220
    iget v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->h:I

    iput v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->h:I

    .line 221
    iget v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->i:F

    iput v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->i:F

    .line 222
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->j:Z

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->j:Z

    .line 223
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->k:Z

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->k:Z

    .line 224
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->l:Z

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->l:Z

    .line 225
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->m:Z

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->m:Z

    .line 226
    const/4 v1, 0x0

    iput-object v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->q:Ljava/lang/ref/WeakReference;

    .line 227
    iput-boolean v4, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->o:Z

    .line 228
    iput v4, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->p:I

    .line 229
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/template/TemplateInfo;->n:Z

    iput-boolean v1, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;->n:Z

    .line 230
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 243
    return-void
.end method

.class final Lcom/c/b/bo$c;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/c/b/bo;

.field private b:Lcom/c/b/bo$a;

.field private c:Lcom/c/b/ba;

.field private d:I

.field private e:I

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Lcom/c/b/bo;)V
    .locals 0

    .prologue
    .line 848
    iput-object p1, p0, Lcom/c/b/bo$c;->a:Lcom/c/b/bo;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 849
    invoke-direct {p0}, Lcom/c/b/bo$c;->a()V

    .line 850
    return-void
.end method

.method private a([BII)I
    .locals 5

    .prologue
    .line 883
    move v1, p3

    move v0, p2

    .line 884
    :goto_0
    if-lez v1, :cond_2

    .line 885
    invoke-direct {p0}, Lcom/c/b/bo$c;->b()V

    .line 886
    iget-object v2, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    if-nez v2, :cond_0

    .line 887
    if-ne v1, p3, :cond_2

    .line 889
    const/4 v0, -0x1

    .line 905
    :goto_1
    return v0

    .line 894
    :cond_0
    iget v2, p0, Lcom/c/b/bo$c;->d:I

    iget v3, p0, Lcom/c/b/bo$c;->e:I

    sub-int/2addr v2, v3

    .line 895
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 896
    if-eqz p1, :cond_1

    .line 897
    iget-object v3, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    iget v4, p0, Lcom/c/b/bo$c;->e:I

    invoke-virtual {v3, p1, v4, v0, v2}, Lcom/c/b/ba;->b([BIII)V

    .line 898
    add-int/2addr v0, v2

    .line 900
    :cond_1
    iget v3, p0, Lcom/c/b/bo$c;->e:I

    add-int/2addr v3, v2

    iput v3, p0, Lcom/c/b/bo$c;->e:I

    .line 901
    sub-int/2addr v1, v2

    .line 902
    goto :goto_0

    .line 905
    :cond_2
    sub-int v0, p3, v1

    goto :goto_1
.end method

.method private a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 944
    new-instance v0, Lcom/c/b/bo$a;

    iget-object v1, p0, Lcom/c/b/bo$c;->a:Lcom/c/b/bo;

    invoke-direct {v0, v1, v2}, Lcom/c/b/bo$a;-><init>(Lcom/c/b/f;B)V

    iput-object v0, p0, Lcom/c/b/bo$c;->b:Lcom/c/b/bo$a;

    .line 945
    iget-object v0, p0, Lcom/c/b/bo$c;->b:Lcom/c/b/bo$a;

    invoke-virtual {v0}, Lcom/c/b/bo$a;->a()Lcom/c/b/ba;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    .line 946
    iget-object v0, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    invoke-virtual {v0}, Lcom/c/b/ba;->a()I

    move-result v0

    iput v0, p0, Lcom/c/b/bo$c;->d:I

    .line 947
    iput v2, p0, Lcom/c/b/bo$c;->e:I

    .line 948
    iput v2, p0, Lcom/c/b/bo$c;->f:I

    .line 949
    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 957
    iget-object v0, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/c/b/bo$c;->e:I

    iget v1, p0, Lcom/c/b/bo$c;->d:I

    if-ne v0, v1, :cond_0

    .line 960
    iget v0, p0, Lcom/c/b/bo$c;->f:I

    iget v1, p0, Lcom/c/b/bo$c;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/c/b/bo$c;->f:I

    .line 961
    iput v2, p0, Lcom/c/b/bo$c;->e:I

    .line 962
    iget-object v0, p0, Lcom/c/b/bo$c;->b:Lcom/c/b/bo$a;

    invoke-virtual {v0}, Lcom/c/b/bo$a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 963
    iget-object v0, p0, Lcom/c/b/bo$c;->b:Lcom/c/b/bo$a;

    invoke-virtual {v0}, Lcom/c/b/bo$a;->a()Lcom/c/b/ba;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    .line 964
    iget-object v0, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    invoke-virtual {v0}, Lcom/c/b/ba;->a()I

    move-result v0

    iput v0, p0, Lcom/c/b/bo$c;->d:I

    .line 970
    :cond_0
    :goto_0
    return-void

    .line 966
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    .line 967
    iput v2, p0, Lcom/c/b/bo$c;->d:I

    goto :goto_0
.end method


# virtual methods
.method public final available()I
    .locals 2

    .prologue
    .line 920
    iget v0, p0, Lcom/c/b/bo$c;->f:I

    iget v1, p0, Lcom/c/b/bo$c;->e:I

    add-int/2addr v0, v1

    .line 921
    iget-object v1, p0, Lcom/c/b/bo$c;->a:Lcom/c/b/bo;

    invoke-virtual {v1}, Lcom/c/b/bo;->a()I

    move-result v1

    sub-int v0, v1, v0

    return v0
.end method

.method public final mark(I)V
    .locals 2

    .prologue
    .line 932
    iget v0, p0, Lcom/c/b/bo$c;->f:I

    iget v1, p0, Lcom/c/b/bo$c;->e:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/c/b/bo$c;->g:I

    .line 933
    return-void
.end method

.method public final markSupported()Z
    .locals 1

    .prologue
    .line 926
    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 3

    .prologue
    .line 910
    invoke-direct {p0}, Lcom/c/b/bo$c;->b()V

    .line 911
    iget-object v0, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    if-nez v0, :cond_0

    .line 912
    const/4 v0, -0x1

    .line 914
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/c/b/bo$c;->c:Lcom/c/b/ba;

    iget v1, p0, Lcom/c/b/bo$c;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/c/b/bo$c;->e:I

    invoke-virtual {v0, v1}, Lcom/c/b/ba;->a(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    goto :goto_0
.end method

.method public final read([BII)I
    .locals 1

    .prologue
    .line 854
    if-nez p1, :cond_0

    .line 855
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 856
    :cond_0
    if-ltz p2, :cond_1

    if-ltz p3, :cond_1

    array-length v0, p1

    sub-int/2addr v0, p2

    if-le p3, v0, :cond_2

    .line 857
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 859
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/c/b/bo$c;->a([BII)I

    move-result v0

    return v0
.end method

.method public final declared-synchronized reset()V
    .locals 3

    .prologue
    .line 938
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/c/b/bo$c;->a()V

    .line 939
    const/4 v0, 0x0

    const/4 v1, 0x0

    iget v2, p0, Lcom/c/b/bo$c;->g:I

    invoke-direct {p0, v0, v1, v2}, Lcom/c/b/bo$c;->a([BII)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 940
    monitor-exit p0

    return-void

    .line 938
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final skip(J)J
    .locals 5

    .prologue
    const-wide/32 v0, 0x7fffffff

    .line 864
    const-wide/16 v2, 0x0

    cmp-long v2, p1, v2

    if-gez v2, :cond_0

    .line 865
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 866
    :cond_0
    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    move-wide p1, v0

    .line 869
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    long-to-int v2, p1

    invoke-direct {p0, v0, v1, v2}, Lcom/c/b/bo$c;->a([BII)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

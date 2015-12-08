.class public final Lcom/roidapp/imagelib/a/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I

.field public static b:I

.field public static c:I

.field public static d:I

.field public static e:Z

.field public static f:Z

.field public static g:Z

.field public static h:I

.field public static i:I

.field public static j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field public static k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field public static l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 17
    sput v2, Lcom/roidapp/imagelib/a/h;->a:I

    .line 18
    sput v1, Lcom/roidapp/imagelib/a/h;->b:I

    .line 19
    sget v0, Lcom/roidapp/imagelib/a/h;->a:I

    sput v0, Lcom/roidapp/imagelib/a/h;->c:I

    .line 20
    sput v2, Lcom/roidapp/imagelib/a/h;->d:I

    .line 21
    sput-boolean v1, Lcom/roidapp/imagelib/a/h;->e:Z

    .line 22
    sput-boolean v2, Lcom/roidapp/imagelib/a/h;->f:Z

    .line 23
    sput-boolean v1, Lcom/roidapp/imagelib/a/h;->g:Z

    .line 24
    const/16 v0, 0x64

    sput v0, Lcom/roidapp/imagelib/a/h;->h:I

    .line 25
    sput v1, Lcom/roidapp/imagelib/a/h;->i:I

    .line 26
    sput-object v3, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 27
    sput-object v3, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 28
    const-string v0, "DefaultSelType"

    sput-object v0, Lcom/roidapp/imagelib/a/h;->l:Ljava/lang/String;

    return-void
.end method

.method public static a()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 31
    sget v0, Lcom/roidapp/imagelib/a/h;->a:I

    sput v0, Lcom/roidapp/imagelib/a/h;->c:I

    .line 32
    sput v1, Lcom/roidapp/imagelib/a/h;->d:I

    .line 33
    sput-boolean v2, Lcom/roidapp/imagelib/a/h;->e:Z

    .line 34
    sput-boolean v1, Lcom/roidapp/imagelib/a/h;->f:Z

    .line 35
    sput-boolean v2, Lcom/roidapp/imagelib/a/h;->g:Z

    .line 36
    const/16 v0, 0x64

    sput v0, Lcom/roidapp/imagelib/a/h;->h:I

    .line 37
    sput v2, Lcom/roidapp/imagelib/a/h;->i:I

    .line 38
    new-instance v0, Lcom/roidapp/imagelib/filter/bj;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/bj;-><init>()V

    .line 39
    iget-object v1, v0, Lcom/roidapp/imagelib/filter/bj;->b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    aget-object v1, v1, v2

    sput-object v1, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 40
    iget-object v0, v0, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v0, v0, v2

    const/4 v1, 0x7

    aget-object v0, v0, v1

    sput-object v0, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 41
    return-void
.end method

.method public static a(Landroid/content/Context;IIZZLjava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x7

    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 44
    sget v1, Lcom/roidapp/imagelib/a/h;->a:I

    sput v1, Lcom/roidapp/imagelib/a/h;->c:I

    .line 45
    sput v2, Lcom/roidapp/imagelib/a/h;->d:I

    .line 46
    sput-boolean v0, Lcom/roidapp/imagelib/a/h;->e:Z

    .line 47
    sput-boolean v2, Lcom/roidapp/imagelib/a/h;->f:Z

    .line 48
    sput-boolean p3, Lcom/roidapp/imagelib/a/h;->g:Z

    .line 49
    const/16 v1, 0x64

    sput v1, Lcom/roidapp/imagelib/a/h;->h:I

    .line 50
    sput v0, Lcom/roidapp/imagelib/a/h;->i:I

    .line 52
    if-eqz p4, :cond_2

    .line 1041
    invoke-static {p0, p5}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 53
    if-nez v1, :cond_0

    .line 54
    new-instance v1, Lcom/roidapp/imagelib/filter/bj;

    invoke-direct {v1}, Lcom/roidapp/imagelib/filter/bj;-><init>()V

    .line 55
    iget-object v2, v1, Lcom/roidapp/imagelib/filter/bj;->b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    aget-object v2, v2, v0

    sput-object v2, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 56
    iget-object v1, v1, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v0, v1, v0

    aget-object v0, v0, v3

    sput-object v0, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 82
    :goto_0
    return-void

    .line 58
    :cond_0
    new-instance v1, Lcom/roidapp/imagelib/filter/a;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/a;-><init>(Landroid/content/Context;)V

    .line 59
    invoke-virtual {v1, p5}, Lcom/roidapp/imagelib/filter/a;->a(Ljava/lang/String;)Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    move-result-object v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    invoke-static {p0, p5}, Lcom/roidapp/imagelib/filter/r;->b(Landroid/content/Context;Ljava/lang/String;)[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a([Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 62
    sput-object v1, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 63
    invoke-interface {v1, p2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(I)Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    sput-object v0, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    goto :goto_0

    .line 65
    :cond_1
    new-instance v1, Lcom/roidapp/imagelib/filter/bj;

    invoke-direct {v1}, Lcom/roidapp/imagelib/filter/bj;-><init>()V

    .line 66
    iget-object v2, v1, Lcom/roidapp/imagelib/filter/bj;->b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    aget-object v2, v2, v0

    sput-object v2, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 67
    iget-object v1, v1, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v0, v1, v0

    aget-object v0, v0, v3

    sput-object v0, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    goto :goto_0

    .line 72
    :cond_2
    new-instance v2, Lcom/roidapp/imagelib/filter/bj;

    invoke-direct {v2}, Lcom/roidapp/imagelib/filter/bj;-><init>()V

    .line 73
    add-int/lit8 v1, p1, -0x1

    .line 74
    if-gez v1, :cond_3

    .line 77
    :goto_1
    iget-object v1, v2, Lcom/roidapp/imagelib/filter/bj;->b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    aget-object v1, v1, v0

    sput-object v1, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 78
    iget-object v1, v2, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v0, v1, v0

    aget-object v0, v0, p2

    sput-object v0, Lcom/roidapp/imagelib/a/h;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1
.end method

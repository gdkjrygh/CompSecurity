.class public final Lcom/kik/e/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/e/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/kik/j/e;

.field private b:Lkik/a/d;

.field private c:Lcom/kik/j/o;

.field private d:Lcom/kik/j/y;

.field private e:Lcom/kik/j/w;

.field private f:Lcom/kik/j/c;

.field private g:Lcom/kik/j/g;

.field private h:Lcom/kik/j/aa;

.field private i:Lcom/kik/j/k;

.field private j:Lcom/kik/j/q;

.field private k:Lcom/kik/j/s;

.field private l:Lcom/kik/j/m;

.field private m:Lcom/kik/j/u;

.field private n:Lcom/kik/j/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 907
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 908
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 891
    invoke-direct {p0}, Lcom/kik/e/b$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kik/e/b$a;)Lkik/a/d;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->b:Lkik/a/d;

    return-object v0
.end method

.method static synthetic b(Lcom/kik/e/b$a;)Lcom/kik/j/a;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->n:Lcom/kik/j/a;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/e/b$a;)Lcom/kik/j/e;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->a:Lcom/kik/j/e;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/e/b$a;)Lcom/kik/j/o;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->c:Lcom/kik/j/o;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/e/b$a;)Lcom/kik/j/g;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->g:Lcom/kik/j/g;

    return-object v0
.end method

.method static synthetic f(Lcom/kik/e/b$a;)Lcom/kik/j/u;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->m:Lcom/kik/j/u;

    return-object v0
.end method

.method static synthetic g(Lcom/kik/e/b$a;)Lcom/kik/j/aa;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->h:Lcom/kik/j/aa;

    return-object v0
.end method

.method static synthetic h(Lcom/kik/e/b$a;)Lcom/kik/j/w;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->e:Lcom/kik/j/w;

    return-object v0
.end method

.method static synthetic i(Lcom/kik/e/b$a;)Lcom/kik/j/c;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->f:Lcom/kik/j/c;

    return-object v0
.end method

.method static synthetic j(Lcom/kik/e/b$a;)Lcom/kik/j/y;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->d:Lcom/kik/j/y;

    return-object v0
.end method

.method static synthetic k(Lcom/kik/e/b$a;)Lcom/kik/j/k;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->i:Lcom/kik/j/k;

    return-object v0
.end method

.method static synthetic l(Lcom/kik/e/b$a;)Lcom/kik/j/m;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->l:Lcom/kik/j/m;

    return-object v0
.end method

.method static synthetic m(Lcom/kik/e/b$a;)Lcom/kik/j/q;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->j:Lcom/kik/j/q;

    return-object v0
.end method

.method static synthetic n(Lcom/kik/e/b$a;)Lcom/kik/j/s;
    .locals 1

    .prologue
    .line 891
    iget-object v0, p0, Lcom/kik/e/b$a;->k:Lcom/kik/j/s;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/e/a;
    .locals 2

    .prologue
    .line 911
    iget-object v0, p0, Lcom/kik/e/b$a;->a:Lcom/kik/j/e;

    if-nez v0, :cond_0

    .line 912
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "clientCoreModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 914
    :cond_0
    iget-object v0, p0, Lcom/kik/e/b$a;->b:Lkik/a/d;

    if-nez v0, :cond_1

    .line 915
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "coreModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 917
    :cond_1
    iget-object v0, p0, Lcom/kik/e/b$a;->c:Lcom/kik/j/o;

    if-nez v0, :cond_2

    .line 918
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "mixpanelModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 920
    :cond_2
    iget-object v0, p0, Lcom/kik/e/b$a;->d:Lcom/kik/j/y;

    if-nez v0, :cond_3

    .line 921
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sponsoredUsersManagerModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 923
    :cond_3
    iget-object v0, p0, Lcom/kik/e/b$a;->e:Lcom/kik/j/w;

    if-nez v0, :cond_4

    .line 924
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "smileyManagerModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 926
    :cond_4
    iget-object v0, p0, Lcom/kik/e/b$a;->f:Lcom/kik/j/c;

    if-nez v0, :cond_5

    .line 927
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "bubbleManagerModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 929
    :cond_5
    iget-object v0, p0, Lcom/kik/e/b$a;->g:Lcom/kik/j/g;

    if-nez v0, :cond_6

    .line 930
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "imageLoaderModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 932
    :cond_6
    iget-object v0, p0, Lcom/kik/e/b$a;->h:Lcom/kik/j/aa;

    if-nez v0, :cond_7

    .line 933
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "userPreferenceModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 935
    :cond_7
    iget-object v0, p0, Lcom/kik/e/b$a;->i:Lcom/kik/j/k;

    if-nez v0, :cond_8

    .line 936
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "kikInternalDeepLinkModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 938
    :cond_8
    iget-object v0, p0, Lcom/kik/e/b$a;->j:Lcom/kik/j/q;

    if-nez v0, :cond_9

    .line 939
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "multiCoreStorageLocationProviderModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 941
    :cond_9
    iget-object v0, p0, Lcom/kik/e/b$a;->k:Lcom/kik/j/s;

    if-nez v0, :cond_a

    .line 942
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scanRequestManagerModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 944
    :cond_a
    iget-object v0, p0, Lcom/kik/e/b$a;->l:Lcom/kik/j/m;

    if-nez v0, :cond_b

    .line 945
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "linkModerationManagerModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 947
    :cond_b
    iget-object v0, p0, Lcom/kik/e/b$a;->m:Lcom/kik/j/u;

    if-nez v0, :cond_c

    .line 948
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "sharedPrefProviderModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 950
    :cond_c
    iget-object v0, p0, Lcom/kik/e/b$a;->n:Lcom/kik/j/a;

    if-nez v0, :cond_d

    .line 951
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "abManagerModule must be set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 953
    :cond_d
    new-instance v0, Lcom/kik/e/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kik/e/b;-><init>(Lcom/kik/e/b$a;B)V

    return-object v0
.end method

.method public final a(Lcom/kik/j/a;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 1061
    iput-object p1, p0, Lcom/kik/e/b$a;->n:Lcom/kik/j/a;

    .line 1065
    return-object p0
.end method

.method public final a(Lcom/kik/j/aa;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 1013
    iput-object p1, p0, Lcom/kik/e/b$a;->h:Lcom/kik/j/aa;

    .line 1017
    return-object p0
.end method

.method public final a(Lcom/kik/j/c;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 997
    iput-object p1, p0, Lcom/kik/e/b$a;->f:Lcom/kik/j/c;

    .line 1001
    return-object p0
.end method

.method public final a(Lcom/kik/j/e;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 957
    iput-object p1, p0, Lcom/kik/e/b$a;->a:Lcom/kik/j/e;

    .line 961
    return-object p0
.end method

.method public final a(Lcom/kik/j/g;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 1005
    iput-object p1, p0, Lcom/kik/e/b$a;->g:Lcom/kik/j/g;

    .line 1009
    return-object p0
.end method

.method public final a(Lcom/kik/j/k;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 1021
    iput-object p1, p0, Lcom/kik/e/b$a;->i:Lcom/kik/j/k;

    .line 1025
    return-object p0
.end method

.method public final a(Lcom/kik/j/m;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 1045
    iput-object p1, p0, Lcom/kik/e/b$a;->l:Lcom/kik/j/m;

    .line 1049
    return-object p0
.end method

.method public final a(Lcom/kik/j/o;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 973
    iput-object p1, p0, Lcom/kik/e/b$a;->c:Lcom/kik/j/o;

    .line 977
    return-object p0
.end method

.method public final a(Lcom/kik/j/q;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 1029
    iput-object p1, p0, Lcom/kik/e/b$a;->j:Lcom/kik/j/q;

    .line 1033
    return-object p0
.end method

.method public final a(Lcom/kik/j/s;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 1037
    iput-object p1, p0, Lcom/kik/e/b$a;->k:Lcom/kik/j/s;

    .line 1041
    return-object p0
.end method

.method public final a(Lcom/kik/j/u;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 1053
    iput-object p1, p0, Lcom/kik/e/b$a;->m:Lcom/kik/j/u;

    .line 1057
    return-object p0
.end method

.method public final a(Lcom/kik/j/w;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 989
    iput-object p1, p0, Lcom/kik/e/b$a;->e:Lcom/kik/j/w;

    .line 993
    return-object p0
.end method

.method public final a(Lcom/kik/j/y;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 981
    iput-object p1, p0, Lcom/kik/e/b$a;->d:Lcom/kik/j/y;

    .line 985
    return-object p0
.end method

.method public final a(Lkik/a/d;)Lcom/kik/e/b$a;
    .locals 0

    .prologue
    .line 965
    iput-object p1, p0, Lcom/kik/e/b$a;->b:Lkik/a/d;

    .line 969
    return-object p0
.end method

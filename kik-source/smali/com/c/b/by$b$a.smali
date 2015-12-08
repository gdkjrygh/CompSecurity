.class public final Lcom/c/b/by$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/by$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/c/b/by$b;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 845
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic b()Lcom/c/b/by$b$a;
    .locals 3

    .prologue
    .line 843
    new-instance v0, Lcom/c/b/by$b$a;

    invoke-direct {v0}, Lcom/c/b/by$b$a;-><init>()V

    new-instance v1, Lcom/c/b/by$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/c/b/by$b;-><init>(B)V

    iput-object v1, v0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    return-object v0
.end method


# virtual methods
.method public final a(I)Lcom/c/b/by$b$a;
    .locals 2

    .prologue
    .line 950
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 951
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 953
    :cond_0
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 954
    return-object p0
.end method

.method public final a(J)Lcom/c/b/by$b$a;
    .locals 3

    .prologue
    .line 941
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 942
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 944
    :cond_0
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 945
    return-object p0
.end method

.method public final a(Lcom/c/b/by$b;)Lcom/c/b/by$b$a;
    .locals 2

    .prologue
    .line 906
    invoke-static {p1}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 907
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 908
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 910
    :cond_0
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 912
    :cond_1
    invoke-static {p1}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 913
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    .line 914
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 916
    :cond_2
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 918
    :cond_3
    invoke-static {p1}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 919
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_4

    .line 920
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 922
    :cond_4
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 924
    :cond_5
    invoke-static {p1}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 925
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_6

    .line 926
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 928
    :cond_6
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 930
    :cond_7
    invoke-static {p1}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 931
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_8

    .line 932
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 934
    :cond_8
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 936
    :cond_9
    return-object p0
.end method

.method public final a(Lcom/c/b/by;)Lcom/c/b/by$b$a;
    .locals 2

    .prologue
    .line 977
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 978
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 980
    :cond_0
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 981
    return-object p0
.end method

.method public final a(Lcom/c/b/f;)Lcom/c/b/by$b$a;
    .locals 2

    .prologue
    .line 968
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 969
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 971
    :cond_0
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 972
    return-object p0
.end method

.method public final a()Lcom/c/b/by$b;
    .locals 2

    .prologue
    .line 862
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 863
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 867
    :goto_0
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    .line 868
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 872
    :goto_1
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    .line 873
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 877
    :goto_2
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    .line 878
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 883
    :goto_3
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_4

    .line 884
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 889
    :goto_4
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    .line 890
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    .line 891
    return-object v0

    .line 865
    :cond_0
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    iget-object v1, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v1}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->a(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 870
    :cond_1
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    iget-object v1, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v1}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->b(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    .line 875
    :cond_2
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    iget-object v1, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v1}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    goto :goto_2

    .line 880
    :cond_3
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    iget-object v1, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v1}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->d(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    goto :goto_3

    .line 886
    :cond_4
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    iget-object v1, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v1}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/b/by$b;->e(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    goto :goto_4
.end method

.method public final b(J)Lcom/c/b/by$b$a;
    .locals 3

    .prologue
    .line 959
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    .line 960
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;Ljava/util/List;)Ljava/util/List;

    .line 962
    :cond_0
    iget-object v0, p0, Lcom/c/b/by$b$a;->a:Lcom/c/b/by$b;

    invoke-static {v0}, Lcom/c/b/by$b;->c(Lcom/c/b/by$b;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 963
    return-object p0
.end method

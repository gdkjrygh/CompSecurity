.class public Lcom/facebook/common/process/c;
.super Ljava/lang/Object;
.source "ProcessName.java"


# static fields
.field public static final a:Lcom/facebook/common/process/c;


# instance fields
.field private final b:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 12
    new-instance v0, Lcom/facebook/common/process/c;

    invoke-direct {v0, v1, v1}, Lcom/facebook/common/process/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/common/process/c;->a:Lcom/facebook/common/process/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    .line 22
    iput-object p2, p0, Lcom/facebook/common/process/c;->c:Ljava/lang/String;

    .line 23
    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/common/process/c;
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v2, 0x1

    .line 33
    if-nez p0, :cond_0

    .line 34
    sget-object v0, Lcom/facebook/common/process/c;->a:Lcom/facebook/common/process/c;

    .line 45
    :goto_0
    return-object v0

    .line 39
    :cond_0
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 40
    array-length v1, v0

    if-le v1, v2, :cond_1

    .line 41
    aget-object v0, v0, v2

    .line 45
    :goto_1
    new-instance v1, Lcom/facebook/common/process/c;

    invoke-direct {v1, p0, v0}, Lcom/facebook/common/process/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    .line 43
    :cond_1
    const-string v0, ""

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/process/c;
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 62
    if-nez p0, :cond_0

    .line 63
    sget-object v0, Lcom/facebook/common/process/c;->a:Lcom/facebook/common/process/c;

    .line 68
    :goto_0
    return-object v0

    .line 65
    :cond_0
    if-eqz p1, :cond_1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    :cond_1
    new-instance v0, Lcom/facebook/common/process/c;

    const-string v1, ""

    invoke-direct {v0, p0, v1}, Lcom/facebook/common/process/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 68
    :cond_2
    new-instance v0, Lcom/facebook/common/process/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/facebook/common/process/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/common/process/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 2

    .prologue
    .line 111
    const-string v0, ""

    iget-object v1, p0, Lcom/facebook/common/process/c;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 120
    invoke-virtual {p0}, Lcom/facebook/common/process/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    const-string v0, "<unknown>"

    .line 125
    :goto_0
    return-object v0

    .line 122
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/common/process/c;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    const-string v0, "<default>"

    goto :goto_0

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/facebook/common/process/c;->c:Ljava/lang/String;

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 131
    if-ne p0, p1, :cond_1

    .line 141
    :cond_0
    :goto_0
    return v0

    .line 134
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 135
    goto :goto_0

    .line 137
    :cond_3
    check-cast p1, Lcom/facebook/common/process/c;

    .line 138
    iget-object v2, p0, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    if-nez v2, :cond_4

    .line 139
    iget-object v2, p1, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 141
    :cond_4
    iget-object v0, p0, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "<unknown>"

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/common/process/c;->b:Ljava/lang/String;

    goto :goto_0
.end method

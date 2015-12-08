.class final Lorg/b/b/b/e;
.super Lorg/b/b/b/a;
.source "SourceFile"

# interfaces
.implements Lorg/b/a/a/c;


# instance fields
.field d:Ljava/lang/Class;


# direct methods
.method constructor <init>(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct/range {p0 .. p6}, Lorg/b/b/b/a;-><init>(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;[Ljava/lang/String;[Ljava/lang/Class;)V

    .line 29
    iput-object p7, p0, Lorg/b/b/b/e;->d:Ljava/lang/Class;

    .line 30
    return-void
.end method


# virtual methods
.method protected final a(Lorg/b/b/b/h;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 44
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 45
    iget v0, p0, Lorg/b/b/b/f;->e:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/b/b/b/f;->a(I)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x10

    invoke-static {v0, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lorg/b/b/b/f;->e:I

    :cond_0
    iget v0, p0, Lorg/b/b/b/f;->e:I

    iget-boolean v2, p1, Lorg/b/b/b/h;->d:Z

    if-nez v2, :cond_a

    const-string v0, ""

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 46
    iget-boolean v0, p1, Lorg/b/b/b/h;->b:Z

    if-eqz v0, :cond_2

    .line 47
    iget-object v0, p0, Lorg/b/b/b/e;->d:Ljava/lang/Class;

    if-nez v0, :cond_1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lorg/b/b/b/f;->b(I)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lorg/b/b/b/e;->d:Ljava/lang/Class;

    :cond_1
    iget-object v0, p0, Lorg/b/b/b/e;->d:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Lorg/b/b/b/h;->a(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 48
    :cond_2
    iget-boolean v0, p1, Lorg/b/b/b/h;->b:Z

    if-eqz v0, :cond_3

    .line 49
    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 50
    :cond_3
    invoke-virtual {p0}, Lorg/b/b/b/f;->a()Ljava/lang/Class;

    move-result-object v0

    iget-object v2, p0, Lorg/b/b/b/f;->g:Ljava/lang/String;

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lorg/b/b/b/f;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lorg/b/b/b/f;->g:Ljava/lang/String;

    :cond_4
    iget-object v2, p0, Lorg/b/b/b/f;->g:Ljava/lang/String;

    iget-boolean v3, p1, Lorg/b/b/b/h;->e:Z

    invoke-virtual {p1, v0, v2, v3}, Lorg/b/b/b/h;->a(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 51
    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 52
    iget-object v0, p0, Lorg/b/b/b/f;->f:Ljava/lang/String;

    if-nez v0, :cond_5

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/b/b/b/f;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/b/b/b/f;->f:Ljava/lang/String;

    :cond_5
    iget-object v0, p0, Lorg/b/b/b/f;->f:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 53
    iget-object v0, p0, Lorg/b/b/b/a;->a:[Ljava/lang/Class;

    if-nez v0, :cond_6

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lorg/b/b/b/f;->c(I)[Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lorg/b/b/b/a;->a:[Ljava/lang/Class;

    :cond_6
    iget-object v0, p0, Lorg/b/b/b/a;->a:[Ljava/lang/Class;

    if-eqz v0, :cond_7

    iget-boolean v2, p1, Lorg/b/b/b/h;->b:Z

    if-nez v2, :cond_d

    array-length v0, v0

    if-nez v0, :cond_c

    const-string v0, "()"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 54
    :cond_7
    :goto_1
    iget-object v0, p0, Lorg/b/b/b/a;->c:[Ljava/lang/Class;

    if-nez v0, :cond_8

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lorg/b/b/b/f;->c(I)[Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lorg/b/b/b/a;->c:[Ljava/lang/Class;

    :cond_8
    iget-object v0, p0, Lorg/b/b/b/a;->c:[Ljava/lang/Class;

    iget-boolean v2, p1, Lorg/b/b/b/h;->c:Z

    if-eqz v2, :cond_9

    if-eqz v0, :cond_9

    array-length v2, v0

    if-nez v2, :cond_e

    .line 55
    :cond_9
    :goto_2
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 45
    :cond_a
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_b

    const-string v0, ""

    goto/16 :goto_0

    :cond_b
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 53
    :cond_c
    const-string v0, "(..)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    :cond_d
    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, v1, v0}, Lorg/b/b/b/h;->a(Ljava/lang/StringBuffer;[Ljava/lang/Class;)V

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 54
    :cond_e
    const-string v2, " throws "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1, v1, v0}, Lorg/b/b/b/h;->a(Ljava/lang/StringBuffer;[Ljava/lang/Class;)V

    goto :goto_2
.end method

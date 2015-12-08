.class public final Lcom/kik/cards/web/usermedia/b;
.super Lcom/kik/g/p;
.source "SourceFile"


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/kik/cards/web/usermedia/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V

    .line 23
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/kik/g/p;-><init>()V

    .line 27
    iput-object p3, p0, Lcom/kik/cards/web/usermedia/b;->d:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/kik/cards/web/usermedia/b;->c:Ljava/lang/String;

    .line 29
    iput-object p1, p0, Lcom/kik/cards/web/usermedia/b;->b:Ljava/lang/String;

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/usermedia/b;->e:Z

    .line 31
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/kik/cards/web/usermedia/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 50
    iget-boolean v0, p0, Lcom/kik/cards/web/usermedia/b;->e:Z

    return v0
.end method

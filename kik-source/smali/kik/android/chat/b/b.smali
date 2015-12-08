.class public final Lkik/android/chat/b/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/b/b$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I

.field private final d:Lcom/kik/n/a/k/a$a;

.field private final e:Ljava/lang/String;

.field private f:I


# direct methods
.method protected constructor <init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;I)V
    .locals 6

    .prologue
    .line 29
    const-string v5, ""

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lkik/android/chat/b/b;-><init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;ILjava/lang/String;)V

    .line 30
    return-void
.end method

.method protected constructor <init>(Lcom/kik/n/a/k/a$a;Ljava/lang/String;Lkik/android/chat/b/d$a;ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/high16 v0, -0x1000000

    iput v0, p0, Lkik/android/chat/b/b;->f:I

    .line 34
    iput-object p2, p0, Lkik/android/chat/b/b;->a:Ljava/lang/String;

    .line 35
    iput p4, p0, Lkik/android/chat/b/b;->b:I

    .line 36
    if-eqz p3, :cond_1

    .line 37
    iget v0, p3, Lkik/android/chat/b/d$a;->w:I

    iput v0, p0, Lkik/android/chat/b/b;->c:I

    .line 39
    invoke-static {p5}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    iget-object p5, p3, Lkik/android/chat/b/d$a;->x:Ljava/lang/String;

    .line 46
    :cond_0
    :goto_0
    iput-object p1, p0, Lkik/android/chat/b/b;->d:Lcom/kik/n/a/k/a$a;

    .line 47
    iput-object p5, p0, Lkik/android/chat/b/b;->e:Ljava/lang/String;

    .line 48
    return-void

    .line 44
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/chat/b/b;->c:I

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lkik/android/chat/b/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 57
    iget v0, p0, Lkik/android/chat/b/b;->f:I

    return v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lkik/android/chat/b/b;->c:I

    return v0
.end method

.method public final d()Lcom/kik/n/a/k/a$a;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lkik/android/chat/b/b;->d:Lcom/kik/n/a/k/a$a;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/chat/b/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Lkik/android/chat/b/b;
    .locals 1

    .prologue
    .line 77
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/chat/b/b;->f:I

    .line 78
    return-object p0
.end method

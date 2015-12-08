.class final Lorg/b/b/b/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/b/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/b/b/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Lorg/b/a/d;

.field c:Lorg/b/a/a/d;

.field private d:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Lorg/b/a/d;Lorg/b/a/a/d;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p2, p0, Lorg/b/b/b/c$a;->a:Ljava/lang/String;

    .line 31
    iput-object p3, p0, Lorg/b/b/b/c$a;->b:Lorg/b/a/d;

    .line 32
    iput-object p4, p0, Lorg/b/b/b/c$a;->c:Lorg/b/a/a/d;

    .line 33
    iput p1, p0, Lorg/b/b/b/c$a;->d:I

    .line 34
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 62
    sget-object v1, Lorg/b/b/b/h;->k:Lorg/b/b/b/h;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v0, p0, Lorg/b/b/b/c$a;->a:Ljava/lang/String;

    invoke-static {v0}, Lorg/b/b/b/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/b/b/b/c$a;->b:Lorg/b/a/d;

    check-cast v0, Lorg/b/b/b/f;

    invoke-virtual {v0, v1}, Lorg/b/b/b/f;->b(Lorg/b/b/b/h;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

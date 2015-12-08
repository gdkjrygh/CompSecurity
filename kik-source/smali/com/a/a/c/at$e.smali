.class final Lcom/a/a/c/at$e;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lcom/a/a/c/at$a;Lcom/a/a/c/at$d;)V
    .locals 3

    .prologue
    .line 156
    const/16 v0, 0xa

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/a/a/c/at$h;

    const/4 v2, 0x0

    aput-object p4, v1, v2

    const/4 v2, 0x1

    aput-object p5, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 157
    iput-wide p1, p0, Lcom/a/a/c/at$e;->a:J

    .line 158
    iput-object p3, p0, Lcom/a/a/c/at$e;->b:Ljava/lang/String;

    .line 159
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    .line 163
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/a/a/c/at$e;->a:J

    invoke-static {v0, v2, v3}, Lcom/a/a/c/f;->b(IJ)I

    move-result v0

    .line 164
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/a/a/c/at$e;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/a/a/c/f;->b(ILcom/a/a/c/b;)I

    move-result v1

    .line 166
    add-int/2addr v0, v1

    return v0
.end method

.method public final a(Lcom/a/a/c/f;)V
    .locals 4

    .prologue
    .line 171
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/a/a/c/at$e;->a:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/a/a/c/f;->a(IJ)V

    .line 172
    const/4 v0, 0x2

    iget-object v1, p0, Lcom/a/a/c/at$e;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/a/a/c/b;->a(Ljava/lang/String;)Lcom/a/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->a(ILcom/a/a/c/b;)V

    .line 173
    return-void
.end method

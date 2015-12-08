.class final Lcom/c/a/c/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/c/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Lcom/c/a/c/j;

.field static final b:Lcom/c/a/c/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 144
    new-instance v0, Lcom/c/a/c/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/c/a/c/m;-><init>(I)V

    sput-object v0, Lcom/c/a/c/l$a;->a:Lcom/c/a/c/j;

    .line 147
    invoke-static {}, Lcom/c/a/c/l;->b()I

    move-result v0

    invoke-static {v0}, Lcom/c/a/c/l;->a(I)Lcom/c/a/c/j;

    move-result-object v0

    sput-object v0, Lcom/c/a/c/l$a;->b:Lcom/c/a/c/j;

    return-void
.end method

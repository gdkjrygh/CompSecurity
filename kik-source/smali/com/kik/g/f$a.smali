.class final Lcom/kik/g/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/g/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/kik/g/e;

.field public final b:Lcom/kik/g/i;

.field private final c:Lcom/kik/g/e$a;


# direct methods
.method public constructor <init>(Lcom/kik/g/e;Lcom/kik/g/i;Lcom/kik/g/e$a;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/kik/g/f$a;->a:Lcom/kik/g/e;

    .line 57
    iput-object p2, p0, Lcom/kik/g/f$a;->b:Lcom/kik/g/i;

    .line 58
    iput-object p3, p0, Lcom/kik/g/f$a;->c:Lcom/kik/g/e$a;

    .line 59
    return-void
.end method

.method static synthetic a(Lcom/kik/g/f$a;)Lcom/kik/g/e$a;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/kik/g/f$a;->c:Lcom/kik/g/e$a;

    return-object v0
.end method

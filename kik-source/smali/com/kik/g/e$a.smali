.class final Lcom/kik/g/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/g/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/kik/g/i;

.field final synthetic b:Lcom/kik/g/e;


# direct methods
.method public constructor <init>(Lcom/kik/g/e;Lcom/kik/g/i;)V
    .locals 0

    .prologue
    .line 17
    iput-object p1, p0, Lcom/kik/g/e$a;->b:Lcom/kik/g/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p2, p0, Lcom/kik/g/e$a;->a:Lcom/kik/g/i;

    .line 19
    return-void
.end method

.class final Lcom/kik/platform/g$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/platform/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/platform/g$a;->b:Ljava/lang/String;

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/kik/platform/g$a;->c:I

    iput-object p1, p0, Lcom/kik/platform/g$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/kik/platform/g$a;->b:Ljava/lang/String;

    iput p3, p0, Lcom/kik/platform/g$a;->c:I

    return-void
.end method

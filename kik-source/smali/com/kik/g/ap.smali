.class final Lcom/kik/g/ap;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/ao;


# direct methods
.method constructor <init>(Lcom/kik/g/ao;)V
    .locals 0

    .prologue
    .line 21
    iput-object p1, p0, Lcom/kik/g/ap;->a:Lcom/kik/g/ao;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/kik/g/ap;->a:Lcom/kik/g/ao;

    check-cast p1, Lcom/kik/g/ar;

    invoke-static {v0, p1}, Lcom/kik/g/ao;->a(Lcom/kik/g/ao;Lcom/kik/g/ar;)V

    .line 27
    return-void
.end method

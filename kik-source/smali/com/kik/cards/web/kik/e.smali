.class final Lcom/kik/cards/web/kik/e;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/kik/KikPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/kik/KikPlugin;)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lcom/kik/cards/web/kik/e;->a:Lcom/kik/cards/web/kik/KikPlugin;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 182
    invoke-super {p0}, Lcom/kik/g/r;->a()V

    .line 183
    iget-object v0, p0, Lcom/kik/cards/web/kik/e;->a:Lcom/kik/cards/web/kik/KikPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/kik/KikPlugin;->b(Lcom/kik/cards/web/kik/KikPlugin;)Z

    .line 184
    return-void
.end method

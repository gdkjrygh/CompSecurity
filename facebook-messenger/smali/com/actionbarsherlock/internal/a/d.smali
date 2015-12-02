.class Lcom/actionbarsherlock/internal/a/d;
.super Ljava/lang/Object;
.source "IcsListPopupWindow.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/actionbarsherlock/internal/a/a;


# direct methods
.method private constructor <init>(Lcom/actionbarsherlock/internal/a/a;)V
    .locals 0

    .prologue
    .line 607
    iput-object p1, p0, Lcom/actionbarsherlock/internal/a/d;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/actionbarsherlock/internal/a/a;Lcom/actionbarsherlock/internal/a/b;)V
    .locals 0

    .prologue
    .line 607
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/a/d;-><init>(Lcom/actionbarsherlock/internal/a/a;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 609
    iget-object v0, p0, Lcom/actionbarsherlock/internal/a/d;->a:Lcom/actionbarsherlock/internal/a/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/a/a;->c()V

    .line 610
    return-void
.end method

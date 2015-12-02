.class abstract Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$b;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/qihoo/security/opti/trashclear/filemanager/d;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V
    .locals 0

    .prologue
    .line 624
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$b;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;)V
    .locals 0

    .prologue
    .line 624
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$b;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V

    return-void
.end method


# virtual methods
.method protected abstract a(Lcom/qihoo/security/opti/trashclear/filemanager/d;Lcom/qihoo/security/opti/trashclear/filemanager/d;)I
.end method

.method public b(Lcom/qihoo/security/opti/trashclear/filemanager/d;Lcom/qihoo/security/opti/trashclear/filemanager/d;)I
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 629
    iget-boolean v2, p1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    iget-boolean v3, p2, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    if-ne v2, v3, :cond_1

    .line 630
    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$b;->a(Lcom/qihoo/security/opti/trashclear/filemanager/d;Lcom/qihoo/security/opti/trashclear/filemanager/d;)I

    move-result v0

    .line 638
    :cond_0
    :goto_0
    return v0

    .line 633
    :cond_1
    iget-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$b;->a:Z

    if-eqz v2, :cond_2

    .line 635
    iget-boolean v2, p1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 638
    :cond_2
    iget-boolean v2, p1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    if-eqz v2, :cond_3

    :goto_1
    move v0, v1

    goto :goto_0

    :cond_3
    move v1, v0

    goto :goto_1
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 624
    check-cast p1, Lcom/qihoo/security/opti/trashclear/filemanager/d;

    check-cast p2, Lcom/qihoo/security/opti/trashclear/filemanager/d;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$b;->b(Lcom/qihoo/security/opti/trashclear/filemanager/d;Lcom/qihoo/security/opti/trashclear/filemanager/d;)I

    move-result v0

    return v0
.end method

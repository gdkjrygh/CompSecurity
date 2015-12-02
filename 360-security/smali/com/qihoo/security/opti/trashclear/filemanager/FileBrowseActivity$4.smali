.class Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$4;
.super Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V
    .locals 1

    .prologue
    .line 645
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$4;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$b;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/opti/trashclear/filemanager/d;Lcom/qihoo/security/opti/trashclear/filemanager/d;)I
    .locals 3

    .prologue
    .line 648
    sget-object v0, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/Collator;->getInstance(Ljava/util/Locale;)Ljava/text/Collator;

    move-result-object v0

    .line 649
    if-eqz v0, :cond_0

    .line 650
    iget-object v1, p1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->a:Ljava/lang/String;

    iget-object v2, p2, Lcom/qihoo/security/opti/trashclear/filemanager/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 652
    :goto_0
    return v0

    :cond_0
    iget-object v0, p1, Lcom/qihoo/security/opti/trashclear/filemanager/d;->a:Ljava/lang/String;

    iget-object v1, p2, Lcom/qihoo/security/opti/trashclear/filemanager/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

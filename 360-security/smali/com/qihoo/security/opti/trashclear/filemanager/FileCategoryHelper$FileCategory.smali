.class public final enum Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FileCategory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum All:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Apk:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Custom:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Doc:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Favorite:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Music:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Other:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Picture:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Theme:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Video:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field public static final enum Zip:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

.field private static final synthetic a:[Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 14
    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "All"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->All:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Music"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Music:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Video"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Video:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Picture"

    invoke-direct {v0, v1, v6}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Picture:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Theme"

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Theme:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Doc"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Doc:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Zip"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Zip:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Apk"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Apk:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Custom"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Custom:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Other"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Other:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    new-instance v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    const-string/jumbo v1, "Favorite"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Favorite:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    .line 13
    const/16 v0, 0xb

    new-array v0, v0, [Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->All:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Music:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Video:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Picture:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Theme:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Doc:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Zip:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Apk:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Custom:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Other:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->Favorite:Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->a:[Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;
    .locals 1

    .prologue
    .line 13
    const-class v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;
    .locals 1

    .prologue
    .line 13
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->a:[Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    invoke-virtual {v0}, [Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/opti/trashclear/filemanager/FileCategoryHelper$FileCategory;

    return-object v0
.end method
